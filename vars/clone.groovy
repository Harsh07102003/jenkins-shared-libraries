def call(String url, String branch){
  echo "This is cloning the cod"
  git url: "${url}", branch: "${branch}"
  echo "code cloning successful"
}
