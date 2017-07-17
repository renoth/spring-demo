package de.ninjo.springdemo.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevelopmentBean {
	Logger LOG = LoggerFactory.getLogger(getClass());

	public void explainMe() {
		LOG.warn("I am a Bean existing in the dev profile");
	}
}
