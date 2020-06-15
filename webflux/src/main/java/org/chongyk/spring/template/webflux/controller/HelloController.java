package org.chongyk.spring.template.webflux.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/mono")
    private Mono<String> getMonoHello() {
        log.info("Mono requested ...");
        return Mono.just("Hello World");
    }

    @GetMapping("/flux")
    private Flux<String> getFluxHello() {
        log.info("Flux requested ...");
        return Flux.interval(Duration.ofMillis(1000))
                .map(item -> "tick: " + item)
                .take(10);
    }
}
