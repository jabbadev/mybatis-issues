package test;

import java.math.BigDecimal;
import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

public class Statements {
	
	public String mapperWithGenericsDynamic(Map<String,Object> in){
		SQL sql = new SQL()
				  .SELECT("*")
				  .FROM((String)in.get("table"))
				  .WHERE("session_id = #{sessionId}");
		
		return sql.toString();
	}
	
	public String mapperWithGenerics(BigDecimal sessionId){
		SQL sql = new SQL()
				  .SELECT("*")
				  .FROM("LOGIN_SESSIONS")
				  .WHERE("session_id = #{sessionId}");
		
		return sql.toString();
	}
	
	public String mapperWithType(BigDecimal sessionId){
		SQL sql = new SQL()
				  .SELECT("*")
				  .FROM("LOGIN_SESSIONS")
				  .WHERE("session_id = #{sessionId}");
		
		return sql.toString();
	}
	
	public String mapperWithoutGenerics(BigDecimal sessionId){
		SQL sql = new SQL()
				  .SELECT("*")
				  .FROM("LOGIN_SESSIONS")
				  .WHERE("session_id = #{sessionId}");
		
		return sql.toString();
	}
}
