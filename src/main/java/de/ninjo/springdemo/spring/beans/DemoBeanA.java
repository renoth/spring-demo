package de.ninjo.springdemo.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoBeanA extends BaseBean {


	private final DemoBeanB beanB;

	@Autowired
	public DemoBeanA(DemoBeanB beanB) {
		this.beanB = beanB;
		LOG.warn("Instantiated " + getClass().getName());
	}


}
