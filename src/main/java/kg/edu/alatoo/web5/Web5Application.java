package kg.edu.alatoo.web5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Web5Application {

	public static void main(String[] args) {
		SpringApplication.run(Web5Application.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "<h1>Hello Aruuk!</h1>";
	}
}
