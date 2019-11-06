package test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Dao implements IDao {
	private SqlSession sqlSession;
	
	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public <T> T mapperWithGenericsDynamicSql(String tablename, BigDecimal sessionId) {
		Map<String,Object> in = new HashMap<>();
		in.put("table",tablename);
		in.put("sessionId",sessionId);
		
		return this.sqlSession.selectOne("test.Mapper.mapperWithGenericsDynamicSql",in);
	}

	@Override
	public <T> T mapperWithGenerics(BigDecimal sessionId) {
		return this.sqlSession.selectOne("test.Mapper.mapperWithGenerics",sessionId);
	}

	@Override
	public <T> T mapperWithType(BigDecimal sessionId) {
		return this.sqlSession.selectOne("test.Mapper.mapperWithType",sessionId);
	}
	
	@Override
	public LoginSession mapperWithoutGenerics(BigDecimal sessionId) {
		return this.sqlSession.selectOne("test.Mapper.mapperWithoutGenerics",sessionId);
	}
}
