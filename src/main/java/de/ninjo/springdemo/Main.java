package de.ninjo.springdemo;

import de.ninjo.springdemo.spring.beans.DemoBeanA;
import de.ninjo.springdemo.spring.beans.DemoBeanB;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	private static org.slf4j.Logger LOG = LoggerFactory.getLogger(Main.class);


	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("de.ninjo.springdemo.spring");

		LOG.error("Finished loading application context");

		context.getBean(DemoBeanB.class).printInjectedValue();

		context.destroy();
	}
}
