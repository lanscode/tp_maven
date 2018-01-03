pipeline {
    agent 'any'
    tools {
        maven 'apache-maven-3.5.2'
        jdk 'jdk1.8.0_15'
    }
stages {     
        stage('Sonarqube analysis') {
    steps {
     withSonarQubeEnv('SonarQube') {
       bat "C:\\Program Files\\sonar\\sonar-runner-2.4\\bin\\sonar-runner.bat"
     }

       } 
  }
    
       
    }
}
