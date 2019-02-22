# Bowling

Bowling Game allows you to add player's score and keep track of the player's score as they hit each Pin in the Bowling game.

Prerequisites

JDK 1.8 must be installed
Apache Maven(3.5 or above) must be installed
Steps to Run the Application

Step 1 : Open Git bash and Clone the Project

        Git clone https://github.com/2019DEV106/Bowling.git

Step 2 : Run the bowling application

Sample command for perfect bowling game 
      
      mvn exec:java -Dexec.mainClass="com.bowling.runner.BowlingGame" -Dexec.args="10 10 10 10 10 10 10 10 10 10 10 10"
      
Sample value for scoregameOfOne
      
      mvn exec:java -Dexec.mainClass="com.bowling.runner.BowlingGame" -Dexec.args="1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1"
      
Sample value for Score Spare Followed By Three
      
      mvn exec:java -Dexec.mainClass="com.bowling.runner.BowlingGame" -Dexec.args="5 5 3 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0"
      
Sample value for score Strike Followed By Three Then Three
      
      mvn exec:java -Dexec.mainClass="com.bowling.runner.BowlingGame" -Dexec.args="10 3 3 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0"
      
Step 3 : Build the bowling game

      mvn clean install
      
Jacoco Reports Jacoco Reports can be viewed in the below location inside project directory

      target/site/jacoco/index.html

Sonar Reports for this application can be found in

https://sonarcloud.io/dashboard?id=2019dev1062019dev106
   
