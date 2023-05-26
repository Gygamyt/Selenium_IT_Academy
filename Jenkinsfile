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
                  bat "mvn clean test"
            }
        }
            }
        post {
               always {
                       allure includeProperties: false, jdk: '', properties: [[key: 'allure.results.directory', value: 'build/allure-results']], report: 'target/allure-report', results: [[path: 'build/allure-results']]
               }
            }
        }