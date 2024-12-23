
pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Run Provar Tests') {
            steps {
                sh 'ant -f build.xml runtests'
            }
        }
    }
    
    post {
        always {
            junit 'ANT/Results/*.xml'
        }
    }
}
