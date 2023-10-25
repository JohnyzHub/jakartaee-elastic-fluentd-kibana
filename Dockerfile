FROM payara/server-full:6.2023.5-jdk17
COPY target/jakartaee-hello-world.war $DEPLOY_DIR