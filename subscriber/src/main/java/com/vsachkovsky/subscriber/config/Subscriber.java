package com.vsachkovsky.subscriber.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class Subscriber {


    @Bean
    public Consumer<String> helloWorldEvent(){
        return System.out::println;
    }

}
