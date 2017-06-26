package au.com.nti.focus.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FocusRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FocusRegistryApplication.class, args);
	}
}
