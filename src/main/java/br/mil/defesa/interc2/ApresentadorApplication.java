package br.mil.defesa.interc2;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableRabbit
@EnableFeignClients
public class ApresentadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApresentadorApplication.class, args);
	}

}
