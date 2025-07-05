def call(String ImageId, String DockerHubUser){
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageId} ."
}
