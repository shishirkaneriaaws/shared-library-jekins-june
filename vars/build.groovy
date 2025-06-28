@Library('sharedlib')_
pipeline {
    agent any
    tools {
        maven 'mymaven'
    }
    
    stages{
        stage('checkout code'){
            steps{
            repo 'https://github.com/Sonal0409/DevOpsCodeDemo.git'
            }
        }
        
       stage('Run maven Command'){
           steps{
               build 'Test'
              filterlogs ('WARNING', 10 )
           }
       } 
        
