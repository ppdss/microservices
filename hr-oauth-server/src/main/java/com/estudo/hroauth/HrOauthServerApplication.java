package com.estudo.hroauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrOauthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrOauthServerApplication.class, args);
	}

}
