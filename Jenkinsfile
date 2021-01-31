/* groovylint-disable CompileStatic */
pipeline {
    agent any
    parameters {
        choice(name: 'Version', choices: ['1.1.0','1.1.1','1.0.1'], description: 'Choose version')
        booleanParam(name: 'executeTests', defaultValue: true, description: 'Yes')
    }
    stages {
        stage('build') {
            steps {
                echo 'Building the application'
            }
        }
        stage('test') {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                echo 'Testing the application'
            }
        }
        stage('deploy') {
            steps {
                echo 'Deploying the application'
                echo "Deploying version${params.VERSION}"
            }
        }
    }
}
