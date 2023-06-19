package com.vsachkovsky.publisher.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
@RequiredArgsConstructor
public class HelloWorldController {

    private final StreamBridge streamBridge;

    @GetMapping
    public String publishHelloWorldMessage(){
        streamBridge.send("helloWorldEvent-out-0", "Hello world");
        return "Hello world message was published";
    }

}
