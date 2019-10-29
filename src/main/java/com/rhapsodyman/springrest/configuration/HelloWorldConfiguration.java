package com.rhapsodyman.springrest.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//@EnableWebMvc   - this prevents swagger ui to work
@ComponentScan(basePackages = "com.rhapsodyman.springrest")
public class HelloWorldConfiguration {

}