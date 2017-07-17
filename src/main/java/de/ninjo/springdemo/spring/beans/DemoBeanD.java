package de.ninjo.springdemo.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoBeanD {
	Logger LOG = LoggerFactory.getLogger(getClass());

	public void explainMe() {
		LOG.warn("I was imported via the @Import annotation");
	}
}
