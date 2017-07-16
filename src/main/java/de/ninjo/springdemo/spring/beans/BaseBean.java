package de.ninjo.springdemo.spring.beans;

import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BaseBean {

	org.slf4j.Logger LOG = LoggerFactory.getLogger(getClass());

	@PostConstruct
	public void onInitialize() {
		LOG.warn("Initializing " + getClass().getName());
	}

	@PreDestroy
	public void onBeforeDestroy() {
		LOG.warn("Destroying " + getClass().getName());
	}
}
