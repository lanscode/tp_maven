pipeline {
    agent 'any'
    tools {
        maven 'apache-maven-3.5.2'
        jdk 'jdk1.8.0_15'
    }
stages {     
        stage('Sonarqube analysis') {
    steps {
    script {
             scannerHome = tool 'SonarScanner';
        }
     withSonarQubeEnv('SonarQube') {
       bat "${SONAR_HOME}\\bin\\sonar-runner.bat"}

       } 
  }
    
       
    }
}
