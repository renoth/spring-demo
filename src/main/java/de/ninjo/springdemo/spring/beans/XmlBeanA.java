package de.ninjo.springdemo.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

public class XmlBeanA {
	private XmlBeanB beanB;

	Logger LOG = LoggerFactory.getLogger(getClass());

	public XmlBeanA() {
		LOG.warn("XmlBeanA reporting in!");
		LOG.warn(beanB + " is set in XmlBeanA!");
	}

	public void setBeanB(XmlBeanB beanB) {
		this.beanB = beanB;
	}
}
