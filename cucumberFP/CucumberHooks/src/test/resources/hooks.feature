Feature: DragDrop

  Scenario:
    Given the user is on the index page at "http://localhost:8000/index.html"
    When Selenium drags "draggable" into "droppable"
    Then should check the contents of "dropstatus"