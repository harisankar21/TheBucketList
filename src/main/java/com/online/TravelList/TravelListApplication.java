package com.online.TravelList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TravelListApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelListApplication.class, args);
	}

}
