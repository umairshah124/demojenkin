pipeline {
  environment {
    registry = "umairshah379/mydockerrepo"
    credentialsId = 'umairshah379'
    dockerImage = ''
  }
  agent any
  stages {
    stage('Cloning Git') {
      steps {
        git 'https://github.com/umairshah124/demojenkin.git'

      }
    }
    stage('Building image') {
      steps{
        script {
                    sh 'docker build -t umairshah379/mydockerrepo:2.0.Realease .'        }
      }
    }
    stage('Push docker image'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'umairshah379', variable: 'doc_variable')]) {
                       sh 'docker login -u umairshah379 -p ${doc_variable}'
                        sh 'docker push umairshah379/mydockerrepo:2.0.Realease'			}
		}
	}	
	}
}
}
