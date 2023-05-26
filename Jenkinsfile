pipeline {
    agent any
    stages {
        stage('Git') {
            steps {
                git url: 'https://github.com/Gygamyt/Selenium_IT_Academy'
            }
        }
        stage('Tests') {
            steps {
                  bat "clean test"
            }
        }
            }
        post {
               always {
                      allure includeProperties: false, jdk: '', results: [[path: 'allure-results']]
               }
            }
        }