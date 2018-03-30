package com.johnlibron.bootstrap;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Bootstrap for service layer.
 */
@Configuration
@Import(DatabaseConfigMySQL.class)
@ComponentScan(basePackages = { "com.johnlibron.service", "com.johnlibron.dao", "com.johnlibron.util" })
public class RootConfig {

}