package dev.camel.demo.configuration;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class RestConfiguration extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        restConfiguration()
                //.component("servlet").host("localhost").port("8080")
                .apiContextPath("/api/doc")
                // .apiContextPath("/api-doc")
                //.apiProperty("api.title", "JAVA DEV JOURNAL REST API")
                //.apiProperty("api.version", "1.0")
                //.apiProperty("cors", "true")
                //.apiContextRouteId("doc-api")
                .port("8080")
                .bindingMode(RestBindingMode.json);
        // .apiProperty("base.path", "/api")
        //restConfiguration()
               //.bindingMode(RestBindingMode.json)
                //.apiContextPath("/api-doc")
      //
    }
}
