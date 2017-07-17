package de.ninjo.springdemo;

import de.ninjo.springdemo.spring.beans.DemoBeanB;
import de.ninjo.springdemo.spring.beans.DemoBeanC;
import de.ninjo.springdemo.spring.beans.DemoBeanD;
import de.ninjo.springdemo.spring.beans.DevelopmentBean;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	private static org.slf4j.Logger LOG = LoggerFactory.getLogger(Main.class);


	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("de.ninjo.springdemo.spring");

		LOG.error("Finished loading application context");

		context.getBean(DemoBeanB.class).printInjectedValue();
		context.getBean(DemoBeanC.class).listBaseBeans();

		context.getBean(DemoBeanC.class).showSelectedBaseBean();
		context.getBean("beanC", DemoBeanC.class).showSelectedBaseBean();
		((DemoBeanC) context.getBean("beanC")).showSelectedBaseBean();

		context.getBean(DemoBeanD.class).explainMe();

		// if (context.getEnvironment().getActiveProfiles())
		context.getBean(DevelopmentBean.class).explainMe();

		context.destroy();
	}
}
