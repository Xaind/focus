package au.com.nti.focus.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FocusSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(FocusSecurityApplication.class, args);
	}
}
