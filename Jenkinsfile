node('slave_1'){
    tools {
        maven "maven3.9.5"
    }
    echo "GitHub BranchName ${env.BRANCH_NAME}"
    echo "Jenkins Job Number ${env.BUILD_NUMBER}"
    echo "Jenkins Node name ${env.NODE_NAME}"
    echo "Jenkins Home ${env.JENKINS_HOME}"
    echo "Jenkins URL ${env.JENKINS_URL}"
    echo "JOB Name ${env.JOB_NAME}"

    stage('clonefromscm'){
        git branch: 'prof', credentialsId: 'JENKINS-PAT', url: 'https://github.com/Profkayboyee/cicd-jenkins-project.git'
    }

    stage('MavenBuild'){
        sh "mvn clean package"
    }

    stage('SonarqubeAnalysis'){
        sh "mvn sonar:sonar"
    }

    stage('Nexusupload'){
        sh "mvn deploy"
    }

    stage('TomcatDeployment'){
        deploy adapters: [tomcat9(credentialsId: 'tomcat-deployer', path: '', url: 'http://18.191.153.210:8009/')], contextPath: 'november14-deployment', war: 'target/*.war'
    }


























}
    

    