package org.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
//@PropertySources(value = {@PropertySource("classpath:application.properties")})
public class BootUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUploadApplication.class, args);
	}
}
