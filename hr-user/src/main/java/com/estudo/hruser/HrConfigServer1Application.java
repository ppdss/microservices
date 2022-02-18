package com.estudo.hruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrConfigServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(HrConfigServer1Application.class, args);
	}

}
