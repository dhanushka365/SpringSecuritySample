package com.example.SpringSecuritySample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableJpaRepositories("com.example.SpringSecuritySample.repository")
@EntityScan("com.example.SpringSecuritySample.model")
//@ComponentScan("com.example.SpringSecuritySample.controller")//optional
@EnableWebSecurity(debug = true)
public class SpringSecuritySampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecuritySampleApplication.class, args);
	}

}
