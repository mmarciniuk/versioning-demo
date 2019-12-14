# Versioning demo
This show how to use versioning with maven.

Remember to setup [ssh-key](https://help.github.com/en/enterprise/2.17/user/authenticating-to-github/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent)

#### Commands
* `mvn package` - to create package of build
* `mvn release:prepare` - to prepare a build and create a new release tag on github
* `mvn release:perform` - to perform the actual release and get the source, javadoc and jar-with-dependencies