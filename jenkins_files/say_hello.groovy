node {
    stage('Say hello') {
        sh "pwd"
        sh "python -u jenkins_files/scripts/hello.py $MYARG"
    }
}
