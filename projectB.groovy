pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Your build steps for project B here
                sh 'echo "Building Project B"'
            }
        }
        stage('Test') {
            steps {
                // Your test steps for project B here
                sh 'echo "Testing Project B"'
            }
        }
        stage('Deploy') {
            steps {
                // Your deployment steps for project B here
                sh 'echo "Deploying Project B"'
            }
        }
    }
}
