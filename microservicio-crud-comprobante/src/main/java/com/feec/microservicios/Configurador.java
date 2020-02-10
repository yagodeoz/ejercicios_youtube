package com.feec.microservicios;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class Configurador {

	@Bean
	public Docket firmaApi() {
		
		 return new Docket(DocumentationType.SWAGGER_2)
				 	.apiInfo(firmaApiInfo())
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.feec.microservicios.controladores"))
	                .paths(PathSelectors.any())
	                .build().useDefaultResponseMessages(false);

	}

	private ApiInfo firmaApiInfo() {
		
		 return new ApiInfoBuilder()
	                .title("Servicio crud de documentos XML")
	                .version("2.0")
	                .contact(new Contact("Byron Segovia", 
	                		"https://www.linkedin.com/in/byron-santiago-segovia-quintero-a3806a24/", 
	                		"byronsantiago@gmail.com"))
	                .build();
	}

}
