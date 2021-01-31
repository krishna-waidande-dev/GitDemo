def gv

pipeline {
    agent any
    parameters {
        choice(name: 'Version', choices:['v1.1.0', 'v1.2.0', 'v1.3.0'], description: 'Choose version')
        booleanParam(name: 'executeTests', defaultValue: true, description: 'Yes')
    }
    stages {
        stage('init') {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage('build') {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage('test') {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    gv.deployApp()
                }
                
            }
        }
    }
}
