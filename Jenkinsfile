pipeline {
    agent any
    tools{
        maven 'MAVEN_HOME'
        jdk 'JAVA_HOME'
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
