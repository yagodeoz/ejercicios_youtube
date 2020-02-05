package com.feec.microservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MicroservicioAdministradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAdministradorApplication.class, args);
	}
}
