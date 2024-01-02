pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                echo 'build intialisation'
            }
        }
        stage('Test'){
            steps {
                echo 'test is complete'
            }
        }
        stage('Deploy') {
            steps {
                echo 'deployment done'
            }
        }
    }
}