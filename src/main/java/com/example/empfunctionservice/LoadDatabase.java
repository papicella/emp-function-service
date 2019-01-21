package com.example.empfunctionservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(EmpRepo repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("pas")));
            log.info("Preloading " + repository.save(new Employee("lucia")));
            log.info("Preloading " + repository.save(new Employee("lucas")));
            log.info("Preloading " + repository.save(new Employee("siena")));
        };
    }
}
