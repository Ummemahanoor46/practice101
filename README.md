# practice101

TALENTTEK PROJECT: TEST
Java, Cucumber, TestNG, JVM, Git etc

# Project owner
UMME MAHANOOR

# To fix code
CTL+A
CTL+ALT+L

# Pre condition
IntelliJ IDE - to write code (community edition)
We need java at least 17 or above
we need Maven to compile test (run our test)
we Git account - to store code

# Dependencies
cucumber-testng
cucumber-java
selenium-java

# Plugins in IntelliJ
Cucumber for Java
Gherkin

# How to run the test?
TBD - TO BE DECIDED

# RUN OPTIONS
Clone the project
To run in parallel use command: mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags="@smoke"
To run in single use flag -Dthreads=single; mvn clean verify -Dthreads=single
To exclude a specific tag use 'not' with tag name i.e. mvn clean verify -Denv=qa -Dbrowser=chrome -Dcucumber.filter.tags="not @ignore"
To post results to JIRA use flag -DPostResultsToJira=true

# Execute NE Test
Run in single thread:
mvn clean verify -Dthreads=single -Denv=stage_ne -Dbrowser=ch -Dcucumber.filter.tags="@test" -Dmaven.test.failure.ignore=true
Run in multiple threads:
mvn clean verify -Denv=prod_carSaver -Dbrowser=ch -Dcucumber.filter.tags="@test" -Dmaven.test.failure.ignore=true

# FW Goal
FW should be comfortable running into different env such as QA/STAGE/PROD ECT
FW should be able to run in different browsers Firefox, Chrome
If test fail, then capture log and screenshot
Function should be reusable - less duplicate
