package com.feec.microservicios;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
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

@Configuration
@EnableSwagger2
public class Configurador {

	public static final String NOMBRE_COLA = "comprobados-queue";
	private static final String NOMBRE_EXCHANGE = "comprobados-queue-exchange";

	@Value("${spring.rabbitmq.host}")
	private String host;

	@Value("${spring.rabbitmq.port}")
	private Integer port;

	@Value("${spring.rabbitmq.username}")
	private String user;

	@Value("${spring.rabbitmq.password}")
	private String password;

	@Value("${spring.rabbitmq.virtualhost}")
	private String virtualhost;

	@Bean
	public ConnectionFactory connectionFactory() throws Exception {
		final CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
		connectionFactory.setAddresses(host);
		connectionFactory.setPort(port);
		connectionFactory.setUsername(user);
		connectionFactory.setPassword(password);
		connectionFactory.setVirtualHost(virtualhost);
		return connectionFactory;
	}

	@Bean
	public RabbitTemplate rabbitTemplate() throws Exception {
		return new RabbitTemplate(connectionFactory());
	}

	@Bean
	public Queue queue() {
		return new Queue(NOMBRE_COLA);
	}

	@Bean
	public TopicExchange exchange() {
		return new TopicExchange(NOMBRE_EXCHANGE);
	}

	@Bean
	public Binding binding(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(NOMBRE_COLA);
	}

	@Bean
	public Docket firmaApi() {

		return new Docket(DocumentationType.SWAGGER_2).apiInfo(firmaApiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.feec.microservicios.controladores"))
				.paths(PathSelectors.any()).build().useDefaultResponseMessages(false);

	}

	private ApiInfo firmaApiInfo() {

		return new ApiInfoBuilder().title("Servicio tareas automáticas envío recepción documentos").version("2.0")
				.contact(new Contact("Byron Segovia",
						"https://www.linkedin.com/in/byron-santiago-segovia-quintero-a3806a24/",
						"byronsantiago@gmail.com"))
				.build();
	}
}
