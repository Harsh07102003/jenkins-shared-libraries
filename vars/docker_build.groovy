def call(String ProjectName, String ImageTag, String dockerhubuser){
  sh "docker build -t ${dockerHubUser}/${ProjectName}:${ImageTag} ."
}
