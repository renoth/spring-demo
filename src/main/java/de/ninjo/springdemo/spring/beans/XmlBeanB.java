package de.ninjo.springdemo.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XmlBeanB {
	Logger LOG = LoggerFactory.getLogger(getClass());

	public XmlBeanB() {
		LOG.warn("XmlBeanB reporting in!");
	}
}
