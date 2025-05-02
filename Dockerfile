FROM openjdk:17
WORKDIR /app
COPY . /app
RUN mkdir -p bin
RUN javac -cp "lib/*" -d bin PallindromeT2.java
CMD ["java", "-cp", "bin:lib/*", "PallindromeT2"] 
