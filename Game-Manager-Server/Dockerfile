FROM openjdk
VOLUME /tmp
ADD target/GameManager-0.0.1-SNAPSHOT.jar usr/project/game_Manager-app.jar
WORKDIR usr/project/
RUN sh -c 'touch gameManager-app.jar'
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://mongo-container/gamemanagerdb", "-jar","game_Manager-app.jar"]
