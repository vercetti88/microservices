package com.services.learningmicroservices.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfig {

    @Bean
    public static ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
