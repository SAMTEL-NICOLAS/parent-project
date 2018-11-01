package co.com.samtel.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = "co.com.samtel")
@PropertySource("classpath:application.properties")
@EnableJpaRepositories(basePackages={"co.com.samtel.repo.repository"})
public class App {
	
	public static void main(String ... args) {
		SpringApplication.run(App.class, args);
	}
}
aaa