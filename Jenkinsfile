pipeline {
    agent any
    tools {
        maven 'apache-maven-3.5.2'
        jdk 'jdk1.8.0_15'
    }
    stages {
        stage('Compile'){
            steps{
                sh 'mvn compile'
            }
        }
        stage ('Build') {
            steps {
            sh 'mvn install'
            }
            post {
                success {
                    junit 'target/surefire-reports/*.xml' 
                }
            }
        }
        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }
    }
}
