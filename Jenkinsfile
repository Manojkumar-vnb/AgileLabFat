pipeline {
    agent any
    environment {
        DOCKER_HUB_USER = 'manojkumarvnb'
        IMAGE_NAME = "fibonacci-app"
    }
    stages {
        
        stage('Test using JUNIT') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Build using Maven') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Create Docker image') {
            steps {
                bat "docker build -t ${DOCKER_HUB_USER}/${IMAGE_NAME}:latest ."
            }
        }
        stage('Push to Docker Hub') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-hub-creds', passwordVariable: 'DOCKER_PASS', usernameVariable: 'DOCKER_USER')]) {
                    bat "echo %DOCKER_PASS% | docker login -u %DOCKER_USER% --password-stdin"
                    bat "docker push ${DOCKER_HUB_USER}/${IMAGE_NAME}:latest"
                }
            }
        }
    }
}
