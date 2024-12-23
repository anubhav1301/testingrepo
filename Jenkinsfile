pipeline {
    agent any
    environment {
        PROVAR_sf_Admin = credentials('PROVAR_sf_Admin') // Fetches the admin username from Jenkins credentials
        PROVAR_sf_Admin_password = credentials('PROVAR_sf_Admin_password') // Fetches the admin password from Jenkins credentials
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Run Provar Tests') {
            steps {
                bat 'ant -f Azure/ANT/build.xml runtests'
                set PROVAR_sf_Admin=${PROVAR_sf_Admin}
                set PROVAR_sf_Admin_password=${PROVAR_sf_Admin_password}
            }
        }
    }
}
