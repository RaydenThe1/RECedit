# RECedit

## Prerequisites

### Java

You need to have Java 21 (Temurin JDK 21):
- [Temurin releases](https://adoptium.net/fr/temurin/releases/)

### Node.js and NPM

Before you can build this project, you must install and configure the following dependencies on your machine:

1. [Node.js](https://nodejs.org/): We use Node to run a development web server and build the project.
   Depending on your system, you can install Node either from source or as a pre-packaged bundle.

After installing Node, you should be able to run the following command to install development tools.
You will only need to run this command when dependencies change in [package.json](package.json).

```
npm install
```

## Local environment


<!-- jhipster-needle-localEnvironment -->

## Start up

```
mvn package
```

```bash
./mvnw 
```

```bash
docker compose -f src/main/docker/sonar.yml up -d
```

To run sonar code smells' check (not working atm)

```bash
./mvnw clean verify sonar:sonar
```

To run the project

```bash
mvn compile exec:java
```


<!-- jhipster-needle-startupCommand -->

## Documentation

- [Package types](documentation/package-types.md)
- [Assertions](documentation/assertions.md)
- [sonar](documentation/sonar.md)

<!-- jhipster-needle-documentation -->
