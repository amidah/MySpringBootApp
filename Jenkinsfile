pipeline {
    agent any
    tools{
        maven 'Maven 3.9.8'
        jdk 'jdk17'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building the Project with maven'
                sh "mvn clean install -DskipTests"
            }
        }
        
        stage('Test') {
            steps {
                echo 'Testing the Project with maven'
                sh "mvn test"
            }
        }
    }
}
