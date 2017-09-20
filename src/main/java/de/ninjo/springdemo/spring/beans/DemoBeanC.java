package de.ninjo.springdemo.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("beanC")
public class DemoBeanC {

	Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private List<BaseBean> baseBeans;

	@Autowired
	private BaseBean baseBean;

	@Autowired
	@Qualifier(value = "qualified")
	private BaseBean qualifiedBaseBean;

	public void listBaseBeans() {
		LOG.info("Listing BaseBeans");
		LOG.warn("Qualified bean is: " + qualifiedBaseBean.toString());
		baseBeans.forEach(b -> LOG.warn(b.toString()));
	}

	public void showSelectedBaseBean() {
		LOG.warn("Selected base bean is " + baseBean.toString());
	}

}
