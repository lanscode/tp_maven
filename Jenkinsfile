pipeline {
    agent any
    tools {
        maven 'apache-maven3.5.2'
        jdk 'jdk1.8.0_15'
    }
    stages {
        
        stage ('Build') {
            steps {
            sh 'mvn install'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}
