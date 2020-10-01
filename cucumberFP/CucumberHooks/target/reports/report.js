$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/hooks.feature");
formatter.feature({
  "name": "DragDrop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the index page at \"http://localhost:8000/index.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.java:22"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selenium drags \"draggable\" into \"droppable\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.java:28"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should check the contents of \"dropstatus\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.java:44"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});