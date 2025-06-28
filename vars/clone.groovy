def call(String url, String branch){
                echo "This is cloning a code"
                git url: "${url}", branch: "${branch}"
                echo "Code cloning successfull"
}
