pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the Project with maven Compile'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Testing the Project with maven Test'
            }
        }
      
        stage('Deploy') {
            steps {
                echo 'Deploying the Project with maven package'
            }
        }
    }
}
