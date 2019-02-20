package com.iamyasas.springasync;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired private MainService mainService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam("name") String name) throws InterruptedException {
        return mainService.getGreeting(name);
    }
}
