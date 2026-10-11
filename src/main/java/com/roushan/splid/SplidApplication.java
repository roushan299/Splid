package com.roushan.splid;

import io.github.cdimascio.dotenv.Dotenv;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class SplidApplication {

	public static void main(String[] args) {
        setEnvironmentVariables();
		SpringApplication.run(SplidApplication.class, args);
	}

    private static void  setEnvironmentVariables() {
        Dotenv dotenv = Dotenv.load();
        dotenv.entries().forEach((entry) -> {
            log.debug("Key: " + entry.getKey() + " Value: " + entry.getValue());
            System.setProperty(entry.getKey(), entry.getValue());
        });
    }

}
