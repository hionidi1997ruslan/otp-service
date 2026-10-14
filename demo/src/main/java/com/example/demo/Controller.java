package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Map;

@RestController
public class Controller {    

    @PostMapping("/token")
    public Map<String, String> creatToken() {
        String token = GenOtp.generator();
        return Map.of("token", token);
    } 

}
