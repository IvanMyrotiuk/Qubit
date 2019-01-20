package com.java.myrotiuk.qubit.rest.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ivan on 20.01.2019. All rights reserved.
 */
@Configuration
public class AppCongiguration {
    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
