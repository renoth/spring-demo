package de.ninjo.springdemo;

import de.ninjo.springdemo.spring.beans.DemoBeanB;
import de.ninjo.springdemo.spring.beans.DemoBeanC;
import de.ninjo.springdemo.spring.beans.DemoBeanD;
import de.ninjo.springdemo.spring.beans.DevelopmentBean;
import de.ninjo.springdemo.spring.beans.ProductionBean;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class Main {
	private static org.slf4j.Logger LOG = LoggerFactory.getLogger(Main.class);


	public static void main(String[] args) {

		ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		xmlApplicationContext.destroy();

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("de.ninjo.springdemo.spring");

		LOG.error("Finished loading application context");

		context.getBean(DemoBeanB.class).printInjectedValue();
		context.getBean(DemoBeanC.class).listBaseBeans();

		context.getBean(DemoBeanC.class).showSelectedBaseBean();
		context.getBean("beanC", DemoBeanC.class).showSelectedBaseBean();
		((DemoBeanC) context.getBean("beanC")).showSelectedBaseBean();

		context.getBean(DemoBeanD.class).explainMe();

		boolean isDevProfileActive = Arrays.asList(context.getEnvironment().getActiveProfiles()).contains("dev");

		if (isDevProfileActive) {
			context.getBean(DevelopmentBean.class).explainMe();
		} else {
			context.getBean(ProductionBean.class).explainMe();
		}

		context.destroy();
	}
}
