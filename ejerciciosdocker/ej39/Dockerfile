FROM eclipse-temurin:17-alpine
WORKDIR /app
COPY SumaEnv.java .
RUN javac SumaEnv.java
ENV NUM1=2
ENV NUM2=2
CMD ["java", "SumaEnv"]
