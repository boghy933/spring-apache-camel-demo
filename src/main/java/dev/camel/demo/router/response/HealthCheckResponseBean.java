package dev.camel.demo.router.response;

import dev.camel.demo.dto.HealthCheckDto;
import org.apache.camel.Exchange;

public class HealthCheckResponseBean {
    public HealthCheckDto returnStatus(Exchange exchange) {
        HealthCheckDto healthCheckDto = new HealthCheckDto();
        healthCheckDto.setStatus("OK");
        return healthCheckDto;
    }
}
