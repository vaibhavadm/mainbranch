package org.vaibhav.spring.mvc;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SpringBootCompelteSpringMvcApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootCompelteSpringMvcApplication.class, args);
		String[] beanNames = run.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String beanName: beanNames){
			System.out.println(beanName);
		}
	}
}
