package com.dfmp.prueba.evertec.springboot.datos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringbootServicioDatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioDatosApplication.class, args);
	}

}
