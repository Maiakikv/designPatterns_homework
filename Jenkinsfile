pipeline {
  agent any
  stages {
    stage('build') {
      parallel {
        stage('build') {
          steps {
            sh 'mvn -Dmaven.test.failure.ignore=true install'
          }
        }

        stage('maven version') {
          steps {
            sh 'mvn --version'
          }
        }

      }
    }

  }
}