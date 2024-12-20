package com.XYZBank.BankSys;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "PYZ Bank",
				description = "Banking Application on backend",
				version = "v1.0",
				contact = @Contact(
						name = "Varun Gurramkonda",
						email = "gvsaivarun@gmail.com"
				),
				license = @License(
						name = "PYZ Bank"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "PYZ Bank Documentation"
		)
)
public class BankingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingSystemApplication.class, args);
	}

}
