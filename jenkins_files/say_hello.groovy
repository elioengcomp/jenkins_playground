node {
    stage('Say hello') {
        sh "pwd"
        sh "python -u jenkins_files/script/hello.py $MYARG"
    }
}
