package com.intouch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroserviceMovieApplication {

	@Bean
	public RestTemplate restTemplate(){
		System.out.println("1231213");
		return  new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceMovieApplication.class,args);
	}
}
