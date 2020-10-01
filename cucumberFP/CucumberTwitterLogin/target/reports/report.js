$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/sample.feature");
formatter.feature({
  "name": "annotation",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on Twitter log in page",
  "keyword": "Given "
});
formatter.match({
  "location": "annotation.java:19"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter the username as \"Timon\" and password as \"Pumba\"",
  "keyword": "When "
});
formatter.match({
  "location": "annotation.java:27"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should fail",
  "keyword": "Then "
});
formatter.match({
  "location": "annotation.java:37"
});
formatter.result({
  "status": "passed"
});
});