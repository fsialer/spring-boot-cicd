package com.fernando.spring_boot_cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Mono<String> helloWorld(){
        return Mono.just("hello world");
    }
}
