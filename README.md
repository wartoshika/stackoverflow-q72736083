# Project to reproduce question from Stackoverflow

Question: [Profile based Spring Cloud Config Server client with optional local developer properties](https://stackoverflow.com/questions/72736083/profile-based-spring-cloud-config-server-client-with-optional-local-developer-pr/72737081?noredirect=1#comment128483680_72737081)

## How to use this repository

### Requirements

- JDK 17

### Via IDE


1. Load project as Gradle project
2. Create a new run configuration with main class `de.qhun.stackoverflow.q72736083.configServer.ConfigServerApplicationKt`
3. Set runtime module to `configServer`
4. Ignore setting any Spring Boot profile (will default to `default`)


5. Create a new run configuration with main class `de.qhun.stackoverflow.q72736083.client.ClientApplicationKt`
6. Set runtime module to `client`
7. Setting Spring Boot profile to `dev`


8. Launch the Config Server. When done, launch the client.


### Via CLI

1. `$ ./gradlew build`
2. `$ java -jar ./configServer/build/libs/configServer.jar`
3. Open a new terminal
4. `$ java -Dspring.profiles.active=dev -jar ./client/build/libs/client.jar`


## Expected console output of the client

```
Fetching config from server at : http://localhost:8888
...
Tomcat initialized with port(s): 1111 (http)
...
Started ClientApplicationKt in 2.815 seconds (JVM running for 3.244)
```

## What should it be

The client should launch on port 2222 as this is configured via `application-dev.yml` within the project root.
