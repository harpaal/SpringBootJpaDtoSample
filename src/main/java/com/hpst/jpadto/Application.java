package com.hpst.jpadto;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Application {
	
	public static void main(String[] args){
		new SpringApplicationBuilder() //
		.sources(Application.class)//
		.run(args);
	}
}
