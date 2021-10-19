package com.example.springbootexceptionhandlingwithzalando.config.problem;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.problem.ProblemModule;
import org.zalando.problem.validation.ConstraintViolationProblemModule;

@Configuration

public class ProblemConfig {

    @Bean
    public ObjectMapper objectMapper() {

        // In this example, stack traces support is enabled by default.
        // If you want to disable stack traces just use new ProblemModule() instead of new ProblemModule().withStackTraces()
        return new ObjectMapper().registerModule(new ProblemModule().withStackTraces());
    }
}
