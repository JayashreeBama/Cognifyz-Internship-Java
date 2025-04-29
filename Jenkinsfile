pipeline {
    agent any

    stages {
        stage('Setup') {
            steps {
                bat 'mkdir bin'
            }
        }

        stage('Compile') {
            steps {
                bat 'javac -cp "lib/*" -d bin PallindromeT2.java'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'java -cp "bin;lib/*" org.junit.runner.JUnitCore PallindromeT2Test'
            }
        }
    }
}
