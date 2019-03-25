node {
    stage('Say hello') {
        sh "python -u ../script/hello.py $MYARG"
    }
}
