package de.ninjo.springdemo.spring;

import de.ninjo.springdemo.spring.beans.DemoBeanA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoBaseApplicationContext {
	@Bean
	public DemoBeanA demoBeanA() {
		return new DemoBeanA();
	}
}
