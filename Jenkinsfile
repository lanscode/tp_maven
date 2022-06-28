node{
      stage("Checkout repo"){
            git "https://github.com/lanscode/tp_maven"
         }
      stage("Package") {
            bat "mvn package"
         }
       stage('SonarQube analysis') {
          //def scannerHome = tool 'SonarID';
          withSonarQubeEnv('SonarID') { // If you have configured more than one global server connection, you can specify its name
            bat "mvn -X sonar:sonar" // bat "${scannerHome}/bin/sonar-scanner"
              }
         }

}
