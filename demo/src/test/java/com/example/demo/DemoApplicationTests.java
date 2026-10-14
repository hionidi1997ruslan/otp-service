package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// поднимает весь контекст спринга (нужна запущенная бд)
@SpringBootTest
class DemoApplicationTests {

	// проверка что приложение вообще стартует без ошибок
	@Test
	void contextLoads() {
	}

}
