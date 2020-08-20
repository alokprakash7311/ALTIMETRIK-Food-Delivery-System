package com.food.delivery.app.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AltimetrikFoodDeliverySystemApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		
		return application.sources(AltimetrikFoodDeliverySystemApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(AltimetrikFoodDeliverySystemApplication.class, args);
	}

}
