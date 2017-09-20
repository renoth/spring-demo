package de.ninjo.springdemo.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;

public class DemoBeanD implements BeanNameAware {
	Logger LOG = LoggerFactory.getLogger(getClass());

	private String name;

	public void explainMe() {
		LOG.warn("I was imported via the @Import annotation");
	}

	@Override
	public void setBeanName(final String name) {
		this.name = name;
		LOG.info("my bean name is: " + this.name);
	}
}
