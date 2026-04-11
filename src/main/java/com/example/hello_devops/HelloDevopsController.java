package com.example.hello_devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDevopsController {

    /**
     * Root endpoint
     * Simple HTML landing page
     */
    @GetMapping("/")
    public String home() {
        return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>DevOps Pipeline</title>
                </head>
                <body style="font-family: Arial; padding: 40px;">

                    <h1>DevOps Pipeline Project</h1>

                    <p>
                        This project demonstrates a complete CI/CD pipeline using 
                        Spring Boot, Docker, Kubernetes (AKS), Helm, Terraform, and GitHub Actions.
                    </p>

                    <hr>

                    <h2> Tech Stack</h2>
                    <p>
                        Spring Boot | Docker | Kubernetes (AKS) | Helm | Terraform | GitHub Actions
                    </p>

                    <hr>

                    <h2> Available Endpoints</h2>
                    <ul>
                        <li><a href="/health">/health</a> → Application health</li>
                        <li><a href="/version">/version</a> → App version</li>
                    </ul>

                    <hr>

                    <h2> GitHub</h2>
                    <p>
                        <a href="https://github.com/Rupesh528/infra" target="_blank">
                            View Source Code
                        </a>
                    </p>

                    <hr>

                    <p><strong>Status:</strong> Running on Kubernetes (AKS) </p>

                </body>
                </html>
                """;
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/version")
    public String version() {
        return "v1.0.0";
    }
}
