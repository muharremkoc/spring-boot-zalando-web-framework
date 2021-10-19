package com.example.springbootexceptionhandlingwithzalando.config.content;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class ContentConfig implements WebMvcConfigurer {

    @Override
    public void configureContentNegotiation(final ContentNegotiationConfigurer configurer) {
        configurer.favorParameter(true)
                .parameterName("mediaType")
                .ignoreAcceptHeader(true)
                .defaultContentType(MediaType.APPLICATION_JSON)
                .mediaType("application/xml", MediaType.APPLICATION_XML)
                .mediaType("application/json", MediaType.APPLICATION_JSON)
                .mediaType("yaml", MediaType.valueOf("application/x-yaml"));
    }
}




