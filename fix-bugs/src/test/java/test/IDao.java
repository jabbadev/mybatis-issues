package test;

import java.math.BigDecimal;

public interface IDao {
  public <T> T mapperWithGenericsDynamicSql(String tablename, BigDecimal sessionId);
  public <T> T mapperWithGenerics(BigDecimal sessionId);
  public <T> T mapperWithType(BigDecimal sessionId);
  public LoginSession mapperWithoutGenerics(BigDecimal sessionId);
  
}
