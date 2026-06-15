pipeline {
    agent any

    triggers {
        pollSCM('H/5 * * * *')
    }

    stages {

        stage('Build') {
            steps {
                sh './mvnw clean package'
            }
        }

        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }

        stage('Deploy') {
            steps {
                sh 'ansible-playbook -i host.ini deploy.yml'
            }
        }
    }

    post {
        failure {
            emailext(
                subject: 'Build Failed',
                body: 'Build failed. Please check Jenkins.',
                to: 'srengty@gmail.com'
            )
        }
    }
}
