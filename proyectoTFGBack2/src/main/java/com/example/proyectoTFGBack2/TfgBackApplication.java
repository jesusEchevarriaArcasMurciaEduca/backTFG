package com.example.proyectoTFGBack2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TfgBackApplication {
	/*
	Autor: Jesús Echevarría Arcas
  Licencia: Creative commons CC BY-SA 4
	 */

	public static void main(String[] args) {
		SpringApplication.run(TfgBackApplication.class, args);}


		@Bean
		public WebMvcConfigurer corsConfigurer () {
			return new WebMvcConfigurer() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*").allowedHeaders("*");
				}
			};
		}

}
