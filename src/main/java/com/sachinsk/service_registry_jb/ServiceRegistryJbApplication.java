package com.sachinsk.service_registry_jb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryJbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryJbApplication.class, args);
	}

}
