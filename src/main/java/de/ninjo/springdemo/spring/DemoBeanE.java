package de.ninjo.springdemo.spring;

import de.ninjo.springdemo.spring.beans.BaseBean;
import de.ninjo.springdemo.spring.beans.DemoBeanA;

public class DemoBeanE extends BaseBean {

	public DemoBeanE(final DemoBeanA demoBeanA) {
		LOG.warn("demo bean E is here!");
		LOG.warn(demoBeanA.toString() + " was injected into demoBeanE");
	}

	private void launchMe() {
		LOG.info("I am launched!");
	}
}
