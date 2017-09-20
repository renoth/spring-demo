package de.ninjo.springdemo.spring;

import de.ninjo.springdemo.spring.beans.BaseBean;
import de.ninjo.springdemo.spring.beans.DemoBeanA;
import de.ninjo.springdemo.spring.beans.DemoBeanD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "de.ninjo.springdemo.spring.beans", includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Bean"
                                                                                                                                            + ".*")
		, excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {DemoBeanD.class, BaseBean.class}))
@PropertySource("classpath:application.properties")
@Import(DemoBeanD.class)
public class DemoBaseApplicationContext {

	@Autowired
	private DemoBeanA demoBeanA;

	@Bean(initMethod = "launchMe")
	@Description("This is my favourite bean because it ends with E")
	public DemoBeanE demoBeanE() {
		return new DemoBeanE(demoBeanA);
	}
}
