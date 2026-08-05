package com.mingkang.cicddemo.controller;

import java.time.Instant;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
                "application", "cicd-demo",
                "environment", "local",
                "version", "v1",
                "message", "Java CI/CD deployment succeeded",
                "time", Instant.now().toString()
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
}