package com.nathan.nflplayersservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class NflplayersservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NflplayersservicesApplication.class, args);
	}
}
