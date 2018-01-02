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
              // bat 'mvn site'
            }
            post {
                success {                   
                    junit 'target/surefire-reports/*.xml' 
                   // step([$class: 'CoberturaPublisher', autoUpdateHealth: false, autoUpdateStability: false, coberturaReportFile: '**/target/site/cobertura/*.xml', failUnhealthy: false, failUnstable: false, maxNumberOfBuilds: 0, onlyStable: false, sourceEncoding: 'ASCII', zoomCoverageChart: false])
                   // step ([$class: 'JavadocArchiver', javadocDir: './target/site/apidocs/', keepAll:true])
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
