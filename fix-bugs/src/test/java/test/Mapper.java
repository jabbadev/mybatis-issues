package test;

import java.math.BigDecimal;
import java.util.Map;
import org.apache.ibatis.annotations.SelectProvider;

public interface Mapper {
	@SelectProvider(type=Statements.class,method="mapperWithGenericsDynamic")
	public <T> T mapperWithGenericsDynamicSql(Map<String,Object> in);
	
	@SelectProvider(type=Statements.class,method="mapperWithGenerics")
	public <T> T mapperWithGenerics(BigDecimal sessionId);
	
	@SelectProvider(type=Statements.class,method="mapperWithType")
	public LoginSession mapperWithType(BigDecimal sessionId);
	
	@SelectProvider(type=Statements.class,method="mapperWithoutGenerics")
	public LoginSession mapperWithoutGenerics(BigDecimal sessionId);
}
