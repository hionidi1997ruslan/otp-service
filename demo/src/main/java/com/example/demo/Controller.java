package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.UUID;

@RestController
public class Controller {    

    private final OtpRepository repository;
    public Controller(OtpRepository repository) {
        this.repository = repository;
    } 

    @PostMapping("/token")
    public Map<String, String> createToken() {
        String code = GenOtp.generator();
    
        UUID id = UUID.randomUUID();

        OtpEntity entity = new OtpEntity(id, code);

        repository.save(entity);

        return Map.of(
            "id", id.toString(),
            "code", code
        );
    }

}
