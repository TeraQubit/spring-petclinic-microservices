package org.springframework.samples.petclinic.customers;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("!cloud")
@Configuration
@EnableDiscoveryClient
public class DiscoveryConfig {

}
