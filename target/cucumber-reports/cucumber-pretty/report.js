$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ClassTasks.feature");
formatter.feature({
  "name": "Class Task",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@classTask"
    }
  ]
});
formatter.scenario({
  "name": "Testing chase bank",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@classTask"
    },
    {
      "name": "@chase"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.NullPointerException\r\n\tat utils.ConfigReader.readProperty(ConfigReader.java:22)\r\n\tat utils.Driver.getDriver(Driver.java:15)\r\n\tat step_definitions.Hooks.setUp(Hooks.java:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I open \"chase bank\"",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.ClassTaskSteps.iOpen(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify title is \"Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.comS\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.ClassTaskSteps.iVerifyTitleIs(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click \"ATM \u0026 branch\" button",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.ClassTaskSteps.iClickButton(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\r\n\tat utils.ConfigReader.readProperty(ConfigReader.java:22)\r\n\tat utils.Driver.getDriver(Driver.java:15)\r\n\tat utils.SeleniumUtils.waitForPageToLoad(SeleniumUtils.java:38)\r\n\tat utils.Screenshot.takeScreenshot(Screenshot.java:11)\r\n\tat step_definitions.Hooks.tearDown(Hooks.java:28)\r\n",
  "status": "failed"
});
});