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
    public String home() {
        return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>DevOps Pipeline</title>
                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            background: #0f172a;
                            color: #e2e8f0;
                            text-align: center;
                            padding: 40px;
                        }
                        .container {
                            max-width: 800px;
                            margin: auto;
                            background: #1e293b;
                            padding: 30px;
                            border-radius: 12px;
                            box-shadow: 0 0 20px rgba(0,0,0,0.5);
                        }
                        h1 {
                            color: #38bdf8;
                        }
                        .badge {
                            display: inline-block;
                            padding: 6px 12px;
                            background: #22c55e;
                            color: black;
                            border-radius: 20px;
                            font-weight: bold;
                            margin: 10px 0;
                        }
                        a {
                            color: #38bdf8;
                            text-decoration: none;
                        }
                        a:hover {
                            text-decoration: underline;
                        }
                        .section {
                            margin-top: 25px;
                        }
                        code {
                            background: #0f172a;
                            padding: 5px 10px;
                            border-radius: 6px;
                        }
                    </style>
                </head>
                <body>

                    <div class="container">
                        <h1>🚀 DevOps Pipeline Project</h1>
                        <p>This project demonstrates a complete CI/CD pipeline using modern DevOps tools.</p>

                        <div class="badge">✅ Running on Kubernetes (AKS)</div>

                        <div class="section">
                            <h2>🛠 Tech Stack</h2>
                            <p>Spring Boot • Docker • Kubernetes (AKS) • Helm • Terraform • GitHub Actions</p>
                        </div>

                        <div class="section">
                            <h2>📡 Available Endpoints</h2>
                            <p><code>/health</code> → Application health</p>
                            <p><code>/version</code> → App version</p>
                        </div>

                        <div class="section">
                            <h2>🔗 GitHub</h2>
                            <p>
                                <a href="https://github.com/Rupesh528/hello-devops" target="_blank">
                                    View Source Code
                                </a>
                            </p>
                        </div>

                        <div class="section">
                            <h2>👨‍💻 Author</h2>
                            <p>Rupesh Sahani</p>
                        </div>
                    </div>

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
