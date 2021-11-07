package com.chenlin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.chenlin.aop.Audience;

/**
 * @author Chen Lin
 * @date 2021-10-12
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("concert")
public class AppConfig {

	   @Bean
	   public Audience audience(){
	       return new Audience();
	   }
}
