package com.johnlibron.bootstrap;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Configuration for controller classes that handles API calls.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.johnlibron.controller.api"})
public class MvcConfigAPI {
	
	@Bean
	public DozerBeanMapper dozerBeanMapper() {
		return new DozerBeanMapper();
	}
}