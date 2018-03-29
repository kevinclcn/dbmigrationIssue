pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''
            . ${HOME}/.bashrc
            ./gradlew bootRepackage
        '''
      }
    }
  }
}