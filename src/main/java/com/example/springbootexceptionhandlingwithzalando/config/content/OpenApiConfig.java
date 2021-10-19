package com.example.springbootexceptionhandlingwithzalando.config.content;

import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springdoc.core.customizers.OperationCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Configuration
public class OpenApiConfig implements OperationCustomizer {
    @Override
    public Operation customize(Operation operation, HandlerMethod handlerMethod) {
        Parameter parameterHeader = new Parameter()
                .in(ParameterIn.QUERY.toString())
                .description("Enter media type: json,xml or yaml. (Default: json)")
                .required(false)
                .name("mediaType")
                .example("json")
                .schema(new StringSchema()
                        .addEnumItem("json")
                        .addEnumItem("xml")
                        .addEnumItem("yaml")
                        ._default("json"));

        operation.addParametersItem(parameterHeader);
        return operation;
    }
}


