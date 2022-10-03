## Installation Steps

### 1. Install python3 
First you need to install python3 in your pc if it is not installed. You can confirm 
it just by running a simple cmd.
```
  python3 --version
```

### 2. install cookiecutter
Just follow the given link in order to install cookiecutter in your pc
[install cookiecutter](https://cookiecutter.readthedocs.io/en/stable/installation.html).

You can verify or confirm it just by running this cmd.
```
cookiecutter --version
```

### 3. Creating Custom Micronaut Micro Service.
You just follow the below steps in order to create new micrnaut microservice project from scratch.

```
cookiecutter git@github.com:Cogoport/micronaut-kotlin-starter-project.git
```

after running above cmd it will prompt as below. you just give your repo name and press enter.
```
project_name [My-First-Project]: repo_name
```

#### congratulations Your project is successfully created.

Now, Run below cmd
```
cd repo_name

git init
```
It will create a git micronaut project. now you can create a new repo on GitHub and you can push
this local repo to remote GitHub repo.