# StreamVault - DevSecOps Capstone

## 🚀 Project Overview
StreamVault is a secure, high-performance backend architecture designed for a modern streaming platform. Built as a comprehensive DevSecOps Capstone project, this repository demonstrates the seamless integration of secure coding practices, automated CI/CD pipelines, containerized deployment, and advanced frontend security techniques.

## ✨ Key Features
* **Advanced Secure Gateway:** A custom 3D interactive authentication interface built with HTML5 Canvas. Includes specific DOM-level obfuscation (disguised IDs and structural masking) to successfully bypass aggressive third-party password manager injections and prevent hitbox detachment.
* **Robust Spring Boot Backend:** A RESTful API architecture utilizing Java 21 and Spring Security to handle user authentication, session management, and secure vault access.
* **Automated DevSecOps Pipeline:** Continuous Integration (CI) configured via GitHub Actions to automatically build and verify code integrity on every push and pull request to the `main` branch.
* **Automated Vulnerability Scanning:** Integrated GitHub Dependabot configured for weekly dependency ecosystem scans to ensure patching of vulnerable libraries.
* **Environment-Agnostic Containerization:** A highly optimized, multi-stage Dockerfile utilizing Eclipse Temurin Alpine images to ensure a lightweight, secure, and reproducible deployment environment.

## 🛠️ Technology Stack
* **Backend:** Java 21, Spring Boot, Spring Web, Spring Security, Maven
* **Frontend:** HTML5, CSS3, Vanilla JavaScript, HTML Canvas (3D Rendering)
* **DevOps & Cloud:** Docker, GitHub Actions (CI/CD)
* **Security & Compliance:** Dependabot, CORS Configuration, Custom DOM Obfuscation

## 📂 Repository Structure
* `.github/workflows/` - Contains the CI/CD pipeline configurations (`ci.yml`).
* `.github/dependabot.yml` - Configuration for automated security vulnerability scanning.
* `frontend-ui/` - Contains the production-ready secure gateway (`login.html`) and vault interface (`index.html`).
* `src/` - The core Spring Boot backend architecture (Controllers, Entities, Repositories, Configurations).
* `Dockerfile` - Multi-stage containerization instructions.
* `pom.xml` - Maven project dependencies and build configurations.

## 💻 Local Setup & Deployment

### Prerequisites
* [Docker](https://www.docker.com/products/docker-desktop/) installed on your machine.
* A modern web browser.

### Running with Docker (Recommended)
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/noeljais/StreamVault-DevSecOps-Capstone.git](https://github.com/noeljais/StreamVault-DevSecOps-Capstone.git)
   cd StreamVault-DevSecOps-Capstone
   ```
2. **Build the Docker Image:**
   ```bash
   docker build -t streamvault-backend .
   ```
3. **Run the Container:**
   ```bash
   docker run -p 8080:8080 streamvault-backend
   ```
4. **Access the Application:**
   Open the `frontend-ui/login.html` file in your preferred web browser to access the secure gateway.

### Running Manually (Without Docker)
Ensure you have JDK 21 and Maven installed.
1. Run `mvn clean package` to build the application.
2. Run `java -jar target/ott_platform-0.0.1-SNAPSHOT.jar` to start the backend server.
3. Open `frontend-ui/login.html` in your browser.