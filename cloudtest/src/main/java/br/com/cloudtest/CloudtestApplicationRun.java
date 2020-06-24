package br.com.cloudtest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudtestApplicationRun {

	public static void main(String[] args) {
		SpringApplication.run(CloudtestApplicationRun.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> System.out.println("START OK");

	}

}
