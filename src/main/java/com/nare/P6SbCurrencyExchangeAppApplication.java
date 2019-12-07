package com.nare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.nare")
@EnableJpaRepositories
public class P6SbCurrencyExchangeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(P6SbCurrencyExchangeAppApplication.class, args);
	}

}
