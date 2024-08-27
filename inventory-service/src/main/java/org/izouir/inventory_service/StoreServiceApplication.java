package org.izouir.inventory_service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EntityScan("org.izouir.store_manager_entities")
@OpenAPIDefinition(info = @Info(title = "Inventory Service API", version = "1.0"))
public class StoreServiceApplication {
    public static void main(final String[] args) {
        SpringApplication.run(StoreServiceApplication.class, args);
    }
}
