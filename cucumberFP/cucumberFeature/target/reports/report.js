$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "Login",
  "description": "  I want to run a sample feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "cucumber setup",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the user login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.java:17"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the email as \"kenadams@gmail.com\" and password as \"ken@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "login.java:31"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "login.java:42"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/register.feature");
formatter.feature({
  "name": "Registration",
  "description": "  I want to run a sample feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "cucumber setup",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the user registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "register.java:17"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters valid data on the page \"Ken\",\"Adams\",\"kenadams@gmail.com\",\"ken@123\",\"02-02-2020\"",
  "keyword": "When "
});
formatter.match({
  "location": "register.java:27"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user registration should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "register.java:46"
});
formatter.result({
  "status": "passed"
});
});