/* groovylint-disable CompileStatic */
pipeline {
    agent any
    environment {
        //SERVER_CREDENTIALS = credentials('github-username')
    }
    stages {
        stage('build') {
            steps {
                echo 'Building the application'
            }
        }
        stage('test') {
            steps {
                echo 'Testing the application'
            }
        }
        stage('deploy') {
            steps {
                echo 'Deploying the application'
                withCredentials([
                    usernamePassword(credentials: 'github-username', usernameVariable: USER, passwordVariable: PWD )
                ]) {
                    echo "Username: ${USER} Password: ${PWD}"
                }
                echo "Deploying app with ${SERVER_CREDENTIALS}"
            }
        }
    }
}
