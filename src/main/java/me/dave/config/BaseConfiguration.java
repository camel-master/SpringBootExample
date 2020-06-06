package me.dave.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("base")
@Configuration
public class BaseConfiguration {

    @Bean
    public String printConfiguration() {
        return "Base Configuration";
    }
}
