package br.com.anderson.userapi;

import br.com.anderson.userapi.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.anderson.userapi.repositories.UserRepository;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class UserApiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(new User(null, "Anderson Dolce", "dolce436@gmail.com", "123", 30.0)));
	}



}
