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
                bat 'ant -f build.xml runtests'
            }
        }
    }
}
