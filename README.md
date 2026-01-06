# TP-30 : Pipeline CI/CD avec Jenkins

## 📋 Description

Ce projet démontre la mise en place d'un **pipeline CI/CD** avec **Jenkins** pour automatiser le build, les tests et le déploiement d'une application Spring Boot.

## 🚀 Installation de Jenkins

### Avec Docker

```bash
docker run -d --name jenkins \
  -p 8080:8080 \
  -p 50000:50000 \
  -v jenkins_home:/var/jenkins_home \
  jenkins/jenkins:lts
```

## 📝 Jenkinsfile

```groovy
pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        
        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }
        
        stage('Docker Build') {
            steps {
                sh 'docker build -t myapp:${BUILD_NUMBER} .'
            }
        }
        
        stage('Deploy') {
            steps {
                sh 'docker run -d -p 8081:8080 myapp:${BUILD_NUMBER}'
            }
        }
    }
}
```

## 📊 Étapes du Pipeline

| Étape | Description |
|-------|-------------|
| Checkout | Récupération du code source |
| Build | Compilation du projet |
| Test | Exécution des tests unitaires |
| Package | Création du JAR |
| Docker Build | Construction de l'image |
| Deploy | Déploiement du conteneur |

## ✨ Fonctionnalités

- ✅ Pipeline as Code (Jenkinsfile)
- ✅ Build automatique Maven
- ✅ Tests unitaires
- ✅ Build Docker
- ✅ Déploiement automatique

## 👨‍💻 Auteur

**Ilyas MICHICH**

---
*Travail Pratique - Pipeline CI/CD avec Jenkins*
