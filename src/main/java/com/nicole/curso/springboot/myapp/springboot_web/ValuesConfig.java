package com.nicole.curso.springboot.myapp.springboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource("classpath:values.properties")
	// Puedo agregar más PropertySource
})
public class ValuesConfig {

}
