
# Quarkus Gradle
A simple hello world using Quarkus + Gradle.

## How to run
Run this command in your terminal to run the application:
```
./gradlew quarkusDev
```

## Using Hello World
Now run following command:
```
curl -i http://localhost:8080/hello/greeting/fabri
```
will return:
```
HTTP/1.1 200 OK
Connection: keep-alive
Content-Type: text/plain;charset=UTF-8
Content-Length: 11
Date: Sun, 10 Mar 2019 17:13:42 GMT

hello fabri
```

## Useful links
* [Quarkus project](https://quarkus.io/)
* [Quarkus Gradle tooling](https://quarkus.io/guides/gradle-tooling)
* [Using Quarkus with Kotlin](https://quarkus.io/guides/kotlin)
