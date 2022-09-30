## Installation Steps


### 1. Clone Repo
```
  git clone git@github.com:Cogoport/{{ cookiecutter.project_name.replace(' ', '-') }}.git
```
### 2. Install Docker and Docker Compose
[Docker and Docker compose Install](https://docs.docker.com/desktop/mac/install/)

### 3. Create ENV files

```
  cp ./api/.env.example ./api/.env
```
### 4. Run Docker compose
```
  docker-compose -f ./api/docker-compose.dev.yml up
```

## Working with IntellJ IDE

We have to install jdk explicitly to use Intellj build and run functionality.

[Link to Download IntellJ IDE](https://www.jetbrains.com/idea/download)

### Setup SDKMan
```shell
curl -s "https://get.sdkman.io" | bash`
```

After installing SDKMan, open a new terminal window/tab and install Java and Micronaut CLI by following the below steps:

1. List java versions

```shell
sdk list java
```

2. Install Latest GraalVM version where `x.y.z-grl` is the version you want to install:
```shell
sdk install java x.y.z-grl
```

3. Verify Java installation:
```shell
java --version
```
4. Install Micronaut CLI
```shell
sdk install micronaut
```


5. Then Run the application
### Voila!!
The application must have been started on port http://localhost:8080 and kafka UI on http://localhost:9000.

