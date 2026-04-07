package com.example.hello_devops;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloDevopsController {
    /**
     * Root endpoint
     * Gives full project info (like a mini API homepage)
     */
    @GetMapping("/")
    public Map<String, Object> home() {

        Map<String, Object> response = new HashMap<>();

        response.put("message", "🚀 Hello from DevOps Pipeline!");
        response.put("description", "This project demonstrates a complete CI/CD pipeline using Spring Boot, Docker, Terraform, AKS, Helm, and GitHub Actions.");

        response.put("endpoints", Map.of(
                "health", "/health",
                "version", "/version",
                "info", "/info"
        ));

        response.put("github", "https://github.com/Rupesh528/hello-devops");

        response.put("status", "Running on Kubernetes (AKS)");

        return response;
    }

    /**
     * Health endpoint
     * Used by Kubernetes probes
     */
    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
                "status", "UP",
                "message", "Application is healthy ✅"
        );
    }

    /**
     * Version endpoint
     * Used in CI/CD validation
     */
    @GetMapping("/version")
    public Map<String, String> version() {
        return Map.of(
                "version", "v1.0.0",
                "build", "devops-pipeline"
        );
    }

    /**
     * Info endpoint
     * More detailed project info
     */
    @GetMapping("/info")
    public Map<String, Object> info() {

        Map<String, Object> info = new HashMap<>();

        info.put("project", "End-to-End DevOps Pipeline");
        info.put("tech_stack", new String[]{
                "Spring Boot",
                "Docker",
                "Kubernetes (AKS)",
                "Helm",
                "Terraform",
                "GitHub Actions"
        });

        info.put("author", "Rupesh Sahani");
        info.put("github", "https://github.com/Rupesh528/hello-devops");

        return info;
    }
}
