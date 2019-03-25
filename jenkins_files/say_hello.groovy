node {
    stage('Say hello') {
        sh "pwd"
        sh "python -u ../script/hello.py $MYARG"
    }
}
