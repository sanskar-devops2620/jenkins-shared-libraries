def call(String url, String branch){
  echo "This is cloning a code"
  git url: "https://github.com/sanskar-devops2620/django-notes-app.git", branch: "main"
  echo "code cloning successfull"
}
