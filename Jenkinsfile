node("") {
    stage("build") {
        git("https://github.com/dwitherspoon/spring-example-java-xml-config.git")
        sh("./mvnw clean install")
    }
    stage("deploy") {
        echo("Deploying the artifacts")
    }
    stage("results") {
        junit("**/target/surefire-reports/TEST-*.xml")
        archiveArtifacts("target/*.jar")
    }
}