pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Your build steps for project A here
                sh 'echo "Building Project A"'
            }
        }
        stage('Test') {
            steps {
                // Your test steps for project A here
                sh 'echo "Testing Project A"'
            }
        }
        stage('Deploy') {
            steps {
                // Your deployment steps for project A here
                sh 'echo "Deploying Project A"'
            }
        }
    }
}
