pipeline {
    agent any

    tools {
        maven 'Maven'  // Make sure 'Maven' is configured in Jenkins Global Tools
        jdk 'JDK'      // Make sure 'JDK' is configured in Jenkins Global Tools
    }

    stages {
        stage('Checkout') {
            steps {
                // Clone from GitHub master branch
                git branch: 'master', url: 'https://github.com/ShashiMadari/MymavenSelenum.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Run Application') {
            steps {
                // Runs the main method in com.example.App
                sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
            }
        }
    }

    post {
        success {
            echo '🎉 Pipeline completed successfully!'
        }
        failure {
            echo '❌ Pipeline failed!'
        }
    }
}
