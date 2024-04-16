package com.example.bank_management_system.productservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ContentConfig implements WebMvcConfigurer {
    @Override
     public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorParameter(true) //by doing this as a true will make user to select any type of content type wheather it is xml or json
                .parameterName("mediaType") //defining mediaType
                .defaultContentType(MediaType.APPLICATION_JSON) //by default it is taking as a Json
                .mediaType("json",MediaType.APPLICATION_JSON)
                .mediaType("xml",MediaType.APPLICATION_XML);
    }
}
