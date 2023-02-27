pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build Application'
            }
        }
		stage('Test') {
            steps {
                echo 'Test Application'
            }
        }
		stage('Deploy') {
            steps {
                echo 'Deploy Application'
            }
        }
    }
	post {
		always {
			emailext body: 'Summary of the pipeline', subject: 'Pipeline Status', to: 'aithaprashanth.246@gmail.com'
		}
	}
	
}
