# mybatis-issues

This repository helps contributors to create [SSCCE](http://sscce.org) : Short, Self Contained, Correct (Compilable), Example.

## Create a new project using gradle

1. Fork this repository on GitHub and clone the forked repository to your machine. Please see the [GitHub guide](https://guides.github.com/activities/forking/) for the details.

  ```sh
$ git clone git@github.com:YOUR_ACCOUNT/mybatis-issues.git
```
1. In the cloned repository, execute gradle(gradlew) command to create a new project.

  ```sh
$ ./gradlew -PprojectName=gh-123 -Ptemplate=_simple
```
  - projectName : The name of the new project. Required.
  - template : The name of the template directory. The default is '_simple'.
	  - _simple : A simple MyBatis project.
	  - _spring : A basic MyBatis-Spring project.
	  - _spring-boot : A basic MyBatis-Spring-Boot project.
1. Make changes so that the project can reproduce your problem.
1. Commit your changes and push them to your forked repository.

  ```sh
$ git add -A
$ git commit -m "Some commit message"
$ git push
```
1. Let us know the URL of your repository.

