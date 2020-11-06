package com.serioussamv.tryout.jenkinspipelinedemo;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Log4j2
public class JenkinsPipelineDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPipelineDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> log.info("feature-1");
	}

}
