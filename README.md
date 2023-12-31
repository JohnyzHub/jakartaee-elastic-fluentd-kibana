# Eclipse Starter for Jakarta EE
This is a sample application generated by the Eclipse Foundation starter for Jakarta EE.

You can run the application by executing the following command from the directory where this file resides. Please ensure you have installed a [Java SE 8+ implementation](https://adoptium.net/?variant=openjdk8) appropriate for your Jakarta EE version and runtime choice (we have tested with Java SE 8, Java SE 11 and Java SE 17). Note, the [Maven Wrapper](https://maven.apache.org/wrapper/) is already included in the project, so a Maven install is not actually needed. You may first need to execute `chmod +x mvnw`.

```
./mvnw clean package cargo:run
```

Once the runtime starts, you can access the project at http://localhost:8080/jakartaee-hello-world.

You can also run the project via Docker. To build the Docker image, execute the following commands from the directory where this file resides. Please ensure you have installed a [Java SE 8+ implementation](https://adoptium.net/?variant=openjdk8) appropriate for your Jakarta EE version/runtime choice and [Docker](https://docs.docker.com/get-docker/) (we have tested with Java SE 8, Java SE 11 and Java SE 17). Note, the [Maven Wrapper](https://maven.apache.org/wrapper/) is already included in the project, so a Maven install is not actually needed. You may first need to execute `chmod +x mvnw`.

```
./mvnw clean package
docker build -t jakartaee-hello-world:v1 .
```

You can then run the Docker image by executing:

```
docker run -it --rm -p 8080:8080 jakartaee-hello-world:v1
```

Once the runtime starts, you can access the project at http://localhost:8080/jakartaee-hello-world.

# Run EFK Stack
To run the elastic-search, fluentd and kibana to index and search the logs, execute the below docker-compose command

```
docker-compose build && docker-compose up -d
```

At the time of writing this, the jakarta ee container is not starting cleanly as it is little early than fluentd.
You may see error response similar to 'Error response from daemon: failed to create task for container: failed to initialize logging driver: dial tcp [::1]:24224: connect: connection refused'

<br>So, it may need a restart, either by executing the 'docker-compose up -d' command again or manual restart the contaiiner using docker desktop ui.
<br>Once all the services are ready, open a browser and hit the below url several time with new name each time 

```
localhost:8080/jakartaee-hello-world/rest/hello?name=Name1
```

This should generate few logs.
Now open the elastic-kibana UI using the below url

```
http://localhost:5601/
```


Once the elastic-kibana ui appears, choose 'Discover' link from the left menu panel, you should be asked to create an index.

![image](https://github.com/JohnyzHub/jakartaee-elastic-fluentd-kibana/assets/17306379/94a6ccd9-0d78-464c-9164-a3ef14c8cadd)



![image](https://github.com/JohnyzHub/jakartaee-elastic-fluentd-kibana/assets/17306379/a34f93c4-1df1-4e96-87fc-abdf84571124)

![image](https://github.com/JohnyzHub/jakartaee-elastic-fluentd-kibana/assets/17306379/7ff40733-33e3-4775-9488-968d773b1ed1)

