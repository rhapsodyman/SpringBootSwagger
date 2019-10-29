package com.rhapsodyman.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	// Swagger   (http://localhost:9000/swagger-ui.html)
	// https://springframework.guru/spring-boot-restful-api-documentation-with-swagger-2/
	//	https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api


	// Deploy to tomcat  
	//	https://www.vojtechruzicka.com/spring-boot-war/
	//	https://www.baeldung.com/spring-boot-war-tomcat-deploy

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}