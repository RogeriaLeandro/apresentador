package br.mil.defesa.interc2.mdlp.apresentador;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class ApresentadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApresentadorApplication.class, args);
	}

}
