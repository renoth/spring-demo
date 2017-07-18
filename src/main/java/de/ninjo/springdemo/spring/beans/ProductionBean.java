package de.ninjo.springdemo.spring.beans;

import de.ninjo.springdemo.spring.CommonConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("!" + CommonConstants.DEV_PROFILE_STRING)
public class ProductionBean {
	private Logger LOG = LoggerFactory.getLogger(getClass());

	public void explainMe() {
		LOG.warn("I am a Bean NOT existing in the dev profile");
	}
}
