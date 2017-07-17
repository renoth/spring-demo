package de.ninjo.springdemo.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoBeanC {

	Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private List<BaseBean> baseBeans;

	@Autowired
	private BaseBean baseBean;

	public void listBaseBeans() {
		baseBeans.stream().forEach(baseBean -> LOG.warn(baseBean.toString()));
	}

	public void showSelectedBaseBean() {
		LOG.warn("Selected base bean is " + baseBean.toString());
	}

}