package de.ninjo.springdemo.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DemoBeanA extends BaseBean implements ApplicationContextAware {

	private DemoBeanB beanB;

	private ApplicationContext applicationContext;

	public DemoBeanA() {
		LOG.warn("Instantiated " + getClass().getName());
	}

	@Override
	public void onInitialize() {
		super.onInitialize();

		LOG.warn(applicationContext.getEnvironment().getProperty("test.property"));
	}

	public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Autowired
	public void setBeanB(final DemoBeanB beanB) {
		this.beanB = beanB;
	}
}
