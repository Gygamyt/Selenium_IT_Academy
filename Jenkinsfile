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
                  bat "clean test -Dbrowser=edge -Dheadless=1"
            }
        }
            }
        post {
               always {
                      allure includeProperties: false, jdk: '', results: [[path: 'allure-results']]
               }
            }
        }