package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:test/spring-config.xml"})
public class SimpleTest {
	@Autowired private IDao dao;
	
	
	@Test()
	public void mapperWithGenerics(){
		LoginSession ls = dao.mapperWithGenerics(BigDecimal.valueOf(1));
		assertEquals(ls.getSessionId(),"000000001");
	}
	
	@Test()
	public void mapperWithGenericsDynamicSql(){
		LoginSession ls = dao.mapperWithGenericsDynamicSql("LOGIN_SESSIONS",BigDecimal.valueOf(1));
		assertEquals(ls.getSessionId(),"000000001");
	}
	
	@Test()
	public void mapperWithType(){
		LoginSession ls = dao.mapperWithType(BigDecimal.valueOf(1));
		assertEquals(ls.getSessionId(),"000000001");
	}
	
	@Test()
	public void mapperWithoutGenerics(){
		LoginSession ls = dao.mapperWithoutGenerics(BigDecimal.valueOf(1));
		assertEquals(ls.getSessionId(),"000000001");
	}
}
