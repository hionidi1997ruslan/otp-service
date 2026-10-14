package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.UUID;

// контроллер принимает http запросы, ответ сразу отдается как json
@RestController
public class Controller {

    // репозиторий для работы с таблицей otp
    private final OtpRepository repository;

    // спринг сам передаст сюда репозиторий при старте, new писать не надо
    public Controller(OtpRepository repository) {
        this.repository = repository;
    }

    // POST /token - выдать новый код
    @PostMapping("/token")
    public Map<String, String> createToken() {
        // генерим код из 6 цифр
        String code = GenOtp.generator();

        // случайный id, по нему потом будем искать код при проверке
        UUID id = UUID.randomUUID();

        // собираем объект для записи в бд
        OtpEntity entity = new OtpEntity(id, code);

        // insert в таблицу otp
        repository.save(entity);

        // отдаем id и код. код возвращаем специально, чтобы скрипт нагрузки мог его взять
        return Map.of(
            "id", id.toString(),
            "code", code
        );
    }

}
