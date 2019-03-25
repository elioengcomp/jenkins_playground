node {
    
    stage('Clone repo') {
        git branch: 'master', url: 'https://github.com/elioengcomp/jenkins_playground.git'   
    }
    
    stage('Say hello') {
        sh "pwd"
        sh "ls -la"
        sh "python -u ./jenkins_files/scripts/hello.py $MYARG"
    }
}
