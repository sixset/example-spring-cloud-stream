package pl.devset.scse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ScseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScseApplication.class, args);
	}

}
