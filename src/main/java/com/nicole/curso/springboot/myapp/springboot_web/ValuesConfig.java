package com.nicole.curso.springboot.myapp.springboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource(value="classpath:values.properties", encoding = "UTF-8")
	// Puedo agregar más PropertySource
})
public class ValuesConfig {

}
