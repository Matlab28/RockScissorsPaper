package com.example.rsp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("http://localhost:63342") // Add your specific origin here
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS").allowedHeaders("Content-Type", "Authorization").exposedHeaders("Authorization").allowCredentials(true).maxAge(3600);
    }
}
