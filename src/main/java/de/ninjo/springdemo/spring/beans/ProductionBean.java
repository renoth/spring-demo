package de.ninjo.springdemo.spring.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class ProductionBean { }
