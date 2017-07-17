package de.ninjo.springdemo.spring;

import de.ninjo.springdemo.spring.beans.DemoBeanD;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
@Import(DemoBeanD.class)
public class DemoBaseApplicationContext {

}
