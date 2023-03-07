pipeline {
    agent any
    tools{
        maven 'M3'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rragul/spring-jenkins']]])
                sh 'mvn clean install'
            }
        }
        stage('Build Image'){
            steps{
                script{
                     sh 'docker build -t ragul05/devops-integration .'
                 }
            }
        }
        stage('Push image to Hub'){
             steps{
                 script{
                   withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u ragul05 -p ${dockerhubpwd}'

                    }
                    sh 'docker push ragul05/devops-integration'
                 }
             }
        }


    }
}