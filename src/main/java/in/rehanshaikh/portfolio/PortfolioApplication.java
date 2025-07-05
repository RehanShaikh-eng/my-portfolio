package in.rehanshaikh.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Collections;

@SpringBootApplication
public class PortfolioApplication {
	public static void main(String[] args) {
		// Get port from Render environment variable
		String port = System.getenv("PORT");
		if (port == null) port = "8080"; // Default for local

		SpringApplication app = new SpringApplication(PortfolioApplication.class);
		// Set the port
		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);
	}
}