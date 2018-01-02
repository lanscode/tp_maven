pipeline {
    agent any
    tools {
        maven 'apache-maven-3.5.2'
        jdk 'jdk1.8.0_15'
    }
    stages {
        stage ('Build') {
            steps {
               bat 'mvn install'
            }
            post {
                success {
                    junit 'target/surefire-reports/*.xml' 
                }
            }
        }
        stage('Compile'){
            steps{
                bat'mvn clean compile'
            }
        }
        stage('Deployement'){
            steps{
                bat 'mvn deploy'
            }
        }
        stage('Test'){
            steps{
                bat 'mvn test'
            }
        }
        stage('Packaging'){
            steps{
                bat 'mvn package'
            }
        }
        stage('Site'){
            steps{
                bat 'mvn site'
            }
        }
    }
}
