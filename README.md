# Demo Spring Boot project

To be deployed on [Dokku](https://github.com/dokku/dokku)

## Requirements

* Java 8
* Maven 3
* Postgres

## Quick-start

```sh
$ createdb dokku-demo
$ mvn clean package
$ java -jar target/dokku-boot-demo-0.0.1-SNAPSHOT.jar
$ curl http://localhost:8080/
```
