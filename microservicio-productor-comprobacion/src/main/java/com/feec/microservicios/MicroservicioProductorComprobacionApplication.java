package com.feec.microservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableEurekaClient
@EnableFeignClients
public class MicroservicioProductorComprobacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioProductorComprobacionApplication.class, args);
	}
	
}
