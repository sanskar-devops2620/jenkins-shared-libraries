def call(String ProjectName, String ImageId){
    sh "docker build -t ${ProjectName}:${ImageId} ."
}
