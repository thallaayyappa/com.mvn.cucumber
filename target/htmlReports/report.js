$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/facebooklogin.feature");
formatter.feature({
  "name": "Facebook login selenium",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "FB login Test Case 1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FBLogin"
    }
  ]
});
formatter.step({
  "name": "user loads FB page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.FBLoginSteps.user_loads_FB_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.FBLoginSteps.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.FBLoginSteps.clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user lands on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.FBLoginSteps.user_lands_on_Dashboard_page()"
});
formatter.result({
  "status": "passed"
});
});