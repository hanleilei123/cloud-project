package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * Created by hanll on 2019/7/17.
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer{
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorPathExtension(true)
                .favorParameter(true)
                .ignoreAcceptHeader(true).parameterName("mediaType")
                .defaultContentType(MediaType.APPLICATION_PROBLEM_JSON_UTF8)
                .mediaType("xml",MediaType.APPLICATION_XML)
                .mediaType("json",MediaType.APPLICATION_JSON);
    }
}
