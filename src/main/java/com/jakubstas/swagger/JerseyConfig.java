package com.jakubstas.swagger;

import com.jakubstas.swagger.rest.EmployeeEndpoint;
import com.jakubstas.swagger.rest.ProductsEndpoint;
import com.jakubstas.swagger.rest.UsersEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(UsersEndpoint.class);
        register(ProductsEndpoint.class);
        register(EmployeeEndpoint.class);
    }
}
