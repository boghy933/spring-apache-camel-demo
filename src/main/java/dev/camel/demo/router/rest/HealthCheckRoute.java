package dev.camel.demo.router.rest;

import dev.camel.demo.configuration.RestConfiguration;
import dev.camel.demo.router.response.HealthCheckResponseBean;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;

@Component
public class HealthCheckRoute extends RestConfiguration {

    @Override
    public void configure() throws Exception {
        // Load configuration from RestConfiguration
        super.configure();

        rest("/api/v1").get("/healthCheck").description("Health check api")
                .param().name("uuid").required(false).type(RestParamType.query).dataType("string").endParam()
                .route().routeId("healthCheck")
                .bean(HealthCheckResponseBean.class);
    }
}
