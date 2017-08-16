package com.jakubstas.swagger;

import com.wordnik.swagger.jaxrs.listing.ApiDeclarationProvider;
import com.wordnik.swagger.jaxrs.listing.ApiListingResourceJSON;
import com.wordnik.swagger.jaxrs.listing.ResourceListingProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyApplicationConfig {
    @Bean
    public ApiListingResourceJSON getApiListingResourceJSON() {
        return new ApiListingResourceJSON();
    }

    @Bean
    public ApiDeclarationProvider getApiDeclarationProvider() {
        return new ApiDeclarationProvider();
    }

	@Bean
    public ResourceListingProvider getResourceListingProvider() {
        return new ResourceListingProvider();
    }
}
