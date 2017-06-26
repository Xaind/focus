package au.com.nti.focus.policy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FocusPolicyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FocusPolicyApplication.class, args);
	}
}
