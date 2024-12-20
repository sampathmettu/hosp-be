package com.example.DoctorAppointment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class HospitalAppointmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalAppointmentApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer mvcConfigurer() {
		return new WebMvcConfigurer() {

			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedOrigins("https:bucks32024.s3-website.ap-south-1.amazonaws.com")
				.allowedMethods("GET", "POST", "PUT", "DELETE")
				.allowedHeaders("*");

				
			}

		};
	}

}
