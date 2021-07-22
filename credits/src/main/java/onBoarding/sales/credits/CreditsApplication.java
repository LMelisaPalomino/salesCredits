package onBoarding.sales.credits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CreditsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditsApplication.class, args);
	}

}
