package com.evento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsLocaisEventoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsLocaisEventoApplication.class, args);
	}

}
