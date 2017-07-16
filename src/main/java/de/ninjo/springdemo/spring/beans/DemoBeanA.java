package de.ninjo.springdemo.spring.beans;

import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.logging.Level;

public class DemoBeanA {
	private static org.slf4j.Logger LOG = LoggerFactory.getLogger(DemoBeanA.class);

	public DemoBeanA() {
		LOG.debug("Instantiated " + getClass().getName());
	}

	@PostConstruct
	public void onInitialize() {
		LOG.debug("Initializing " + getClass().getName());
	}
}
