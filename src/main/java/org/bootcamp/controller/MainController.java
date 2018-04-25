package org.bootcamp.controller;

import org.bootcamp.service.InsuranceCalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainController {
    private final InsuranceCalculatorService service;

    public MainController(InsuranceCalculatorService service) {
        this.service = service;
    }

    private static final String HELLO_MESSAGE = "<h1>Hello From the Web!</h1>";
    
    @GetMapping
    public String sayHello() {
        return HELLO_MESSAGE;
    }
}
