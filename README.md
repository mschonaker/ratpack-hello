# Simple Ratpack hello world application

A simple [Ratpack](https://ratpack.io/) hello world application using pure Java
and Maven instead of Groovy and Gradle. Includes JUnit tests.

## Running using Maven

```
mvn exec:java
```

## Debugging using Maven (via JDWP)

```
mvnDebug exec:java
```

## Packaging

```
mvn clean package
```

## Running after packaging

```
mvn clean package && java -jar target/ratpack-hello-0.1.0-SNAPSHOT.jar

```
