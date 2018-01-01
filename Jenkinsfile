pipeline {
    agent any
    tools {
        maven 'maven3.5.2'
        jdk 'jdk8'
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
