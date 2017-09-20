package de.ninjo.springdemo.spring;

import de.ninjo.springdemo.spring.beans.BaseBean;
import de.ninjo.springdemo.spring.beans.DemoBeanA;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;

public class DemoBeanE extends BaseBean implements ApplicationEventPublisherAware, ApplicationListener<DemoBeanE.BeanEStartedEvent> {

	private ApplicationEventPublisher eventPublisher;

	public DemoBeanE(final DemoBeanA demoBeanA) {
		LOG.warn("demo bean E is here!");
		LOG.warn(demoBeanA.toString() + " was injected into demoBeanE");
	}

	private void launchMe() {
		LOG.info("I am launched!");
		eventPublisher.publishEvent(new BeanEStartedEvent(this));
	}

	@Override
	public void onApplicationEvent(final BeanEStartedEvent event) {
		LOG.error("received bean e started event: " + event.toString());
	}

	@Override
	public void setApplicationEventPublisher(final ApplicationEventPublisher applicationEventPublisher) {
		this.eventPublisher = applicationEventPublisher;
	}

	class BeanEStartedEvent extends ApplicationEvent {
		BeanEStartedEvent(final Object source) {
			super(source);
		}
	}
}
