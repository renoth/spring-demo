package de.ninjo.springdemo.spring.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Qualifier(value = "qualified")
public class DemoBeanB extends BaseBean {
	@Value("${property.used.in.value}")
	private int injectedValue;

	public void printInjectedValue() {
		LOG.warn("The injected value is {}", injectedValue);
	}
}
