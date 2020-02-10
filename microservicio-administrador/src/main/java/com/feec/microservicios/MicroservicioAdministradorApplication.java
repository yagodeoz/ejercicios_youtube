package com.feec.microservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
@EnableHystrixDashboard
@EnableEurekaServer
public class MicroservicioAdministradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAdministradorApplication.class, args);
	}
}
