package dio.patterns_java_spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * @author vverdum
 */


@EnableFeignClients
@SpringBootApplication
public class PatternsJavaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsJavaSpringApplication.class, args);
	}

}
