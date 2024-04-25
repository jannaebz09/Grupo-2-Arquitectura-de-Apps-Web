package pe.edu.upc.qalikay;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "QALIKAY",version = "1.0",description = "API de Qalikay elaborada por el Grupo 2 para el curso de Arquitectura de Aplicaciones Web"))
public class QalikayApplication {

	public static void main(String[] args) {
		SpringApplication.run(QalikayApplication.class, args);
	}

}
