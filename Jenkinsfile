pipeline {
    //agent 'any'
    agent {label 'sonarNode'}
    tools {
        maven 'apache-maven-3.5.2'
        jdk 'jdk1.8.0_15'
    }
stages { 
    stage('Compile'){
            steps{
                bat'mvn clean compile'
            }
        stage ('Build') {
            steps {
               bat 'mvn install'
               bat 'mvn site'
            }
            post {
                success {
                    junit 'target/surefire-reports/*.xml'
                    step([$class: 'CoberturaPublisher', autoUpdateHealth: false, autoUpdateStability: false, coberturaReportFile: '**/target/site/cobertura/*.xml', failUnhealthy: false, failUnstable: false, maxNumberOfBuilds: 0, onlyStable: false, sourceEncoding: 'ASCII', zoomCoverageChart: false])
                    step ([$class: 'JavadocArchiver', javadocDir: './target/site/apidocs/', keepAll:true])
                }
            }
        }
    stage('Deployement'){
            steps{
                bat 'mvn deploy'
            }
      /* stage('Sonarqube analysis') {
             
              steps {
                 withSonarQubeEnv('SonarQube') {
                   bat "C:\\Program Files\\sonar\\sonar-runner-2.4\\bin\\sonar-runner.bat"
                 }

              } 
  }*/
    
       
    }
}
