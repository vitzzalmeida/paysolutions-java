package com.pay.paysolutions;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootTest
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Retorna o nome do arquivo HTML (sem a extensão)
    }
}