//package com.example.nowcoderDemo;
//
//import com.example.nowcoderDemo.dao.AlphaDao;
//import com.example.nowcoderDemo.service.AlphaService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.test.context.ContextConfiguration;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//@SpringBootTest
//@ContextConfiguration(classes = NowcoderDemoApplication.class)
//public class NowcoderDemoApplicationTests implements ApplicationContextAware {
//
//	private ApplicationContext applicationContext;
//
//	@Override
//	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		this.applicationContext = applicationContext;
//	}
//
//	@Test
//	void contextLoads() {
//		System.out.println(applicationContext);
//
//		AlphaDao alphaDao = applicationContext.getBean(AlphaDao.class);
//		System.out.println(alphaDao.select());
//
//		alphaDao = applicationContext.getBean("alphaHibernate", AlphaDao.class);
//		System.out.println(alphaDao.select());
//	}
//
//	@Test
//	public void testBeanManagement() {
//		AlphaService alphaService = applicationContext.getBean(AlphaService.class);
//		System.out.println(alphaService);
//	}
//
//	@Test
//	public void testBeanConfig() {
//		SimpleDateFormat simpleDateFormat = applicationContext.getBean(SimpleDateFormat.class);
//		System.out.println(simpleDateFormat.format(new Date()));
//	}
//
//	@Autowired
//	@Qualifier("alphaHibernate")
//	private AlphaDao alphaDao;//依赖输入
//
//	@Test
//	public void testDI() {
//		System.out.println(alphaDao);
//	}
//}
