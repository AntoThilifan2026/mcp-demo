package com.example.server2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class DemoServerApplication {
    @GetMapping("/get")
    public CompletableFuture<String> get(){
        return CompletableFuture.completedFuture("Hello World");
    }
    @GetMapping("/sum")
    public CompletableFuture<Integer> sum(@RequestParam int a, @RequestParam int b) {
        return CompletableFuture.completedFuture(a + b);
    }

    @GetMapping("/healthz")
    public String health() {
        return "Server 1 is UP";
    }
}