package dio.patterns_java_spring;

import org.apache.logging.log4j.util.InternalApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

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

@Configuration
//@EnableSwagger2
@EnableFeignClients
@SpringBootApplication
public class PatternsJavaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsJavaSpringApplication.class, args);
	}

}
