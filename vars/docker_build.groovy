def call(String ProjectName, String ImageId, String DockerHubUser){
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageId} ."
}
