#  DevOps Pipeline (Spring Boot + Terraform + AKS + Helm + GitHub Actions)

##  Overview

This project demonstrates a complete **end-to-end DevOps pipeline** using modern tools and cloud infrastructure.

It showcases how a simple **Spring Boot application** can be:

* Containerized using Docker 
* Built using GitHub Actions (CI) 
* Deployed automatically to Azure Kubernetes Service (AKS)
* Managed using Helm charts 
* Provisioned via Terraform 

---

##  Architecture

```
Developer → GitHub → CI Pipeline → Docker Hub → CD Pipeline → AKS → Helm → Pods → Service → Public IP
```

---

## 🛠️ Tech Stack

| Category         | Tools              |
| ---------------- | ------------------ |
| Backend          | Spring Boot (Java) |
| Containerization | Docker             |
| CI/CD            | GitHub Actions     |
| Cloud            | Azure (AKS)        |
| Infrastructure   | Terraform          |
| Deployment       | Helm               |
| Orchestration    | Kubernetes         |

---

##  Project Structure

```
hello-devops/
│
├── src/                  # Spring Boot source code
├── Dockerfile            # Docker configuration
├── pom.xml               # Maven config
│
├── terraform/            # Infrastructure (AKS)
│   └── main.tf
│
├── hello-chart/          # Helm chart
│   ├── templates/
│   ├── values.yaml
│
└── .github/workflows/
    ├── build.yml         # CI Pipeline
    └── release.yml       # CD Pipeline
```

---

##  Features

* ✅ Fully automated CI/CD pipeline
* ✅ Docker image versioning using commit SHA
* ✅ Infrastructure as Code using Terraform
* ✅ Kubernetes deployment using Helm
* ✅ Health check endpoint (`/health`)
* ✅ Zero manual deployment steps

---

##  CI/CD Workflow

###  Continuous Integration (CI)

Triggered on every push:

* Build Spring Boot app
* Create Docker image
* Tag image using commit SHA
* Push to Docker Hub

---

###  Continuous Deployment (CD)

Triggered after CI:

* Authenticate with Azure
* Connect to AKS cluster
* Deploy using Helm
* Update running application

---

##  Docker

Build image locally:

```bash
docker build -t hello-devops .
```

Run container:

```bash
docker run -p 8080:8080 hello-devops
```

---

##  Kubernetes Deployment

Check pods:

```bash
kubectl get pods
```

Check services:

```bash
kubectl get svc
```

---

##  Helm Commands

Install:

```bash
helm install hello-app ./hello-chart
```

Upgrade:

```bash
helm upgrade hello-app ./hello-chart
```

Uninstall:

```bash
helm uninstall hello-app
```

---

##  Terraform (Infrastructure)

Initialize:

```bash
terraform init
```

Apply:

```bash
terraform apply
```

Destroy:

```bash
terraform destroy
```

---

##  Access Application

After deployment:

```bash
kubectl get svc
```

Open:

```
http://<external-ip>
```

---

##  GitHub Secrets Required

* `DOCKER_USERNAME`
* `DOCKER_PASSWORD`
* `AZURE_CREDENTIALS`
* `AKS_CLUSTER_NAME`
* `RESOURCE_GROUP`

---

##  Key Learnings

* End-to-end CI/CD pipeline design
* Kubernetes deployment strategies
* Helm templating and release management
* Azure cloud infrastructure provisioning
* Debugging real-world DevOps issues

