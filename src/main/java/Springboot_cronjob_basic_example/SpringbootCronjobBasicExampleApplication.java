package Springboot_cronjob_basic_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling  // This will hit the @Schedule
@SpringBootApplication
public class SpringbootCronjobBasicExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCronjobBasicExampleApplication.class, args);
	}

}
