package com.pe.crce.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})*/
@SpringBootApplication
public class AppBibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppBibliotecaApplication.class, args);
	}

}
