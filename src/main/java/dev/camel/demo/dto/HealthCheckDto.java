package dev.camel.demo.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

public class HealthCheckDto {
    private static String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        HealthCheckDto.status = status;
    }
}
