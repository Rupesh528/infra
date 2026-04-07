package com.example.hello_devops;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloDevopsController {

    /**
     * Root endpoint
     * Used to quickly verify app is running
     */
    @GetMapping("/")
    public String home() {
        return "Hello from DevOps Pipeline !!!!!!";
    }

    /**
     * Health endpoint
     * Used by Kubernetes liveness/readiness probes
     */
    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    /**
     * Version endpoint
     * Useful in CI/CD to verify deployment version
     */
    @GetMapping("/version")
    public String version() {
        return "v1.0.0";
    }
}
