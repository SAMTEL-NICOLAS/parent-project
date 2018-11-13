package co.com.samtel.controller.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = "co.com.samtel")
@PropertySource("classpath:application.properties")
@EnableJpaRepositories(basePackages={"co.com.samtel.repo.repository"})
public class App extends SpringBootServletInitializer{
	
	private static Class<App> applicationClass = App.class;
	
	public static void main(String ... args) {
		SpringApplication.run(App.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
}