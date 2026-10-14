package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// главный класс, отсюда стартует приложение
// аннотация включает автонастройку и поиск компонентов в этом пакете (контроллер, репозиторий)
@SpringBootApplication
public class TokenMock {

	public static void main(String[] args) {
		// запуск спринга и встроенного tomcat на 8080
		SpringApplication.run(TokenMock.class, args);
	}

}
