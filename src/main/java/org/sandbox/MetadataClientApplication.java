package org.sandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.sandbox")
public class MetadataClientApplication {
    final private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MetadataClientApplication.class, args);
    }
}
