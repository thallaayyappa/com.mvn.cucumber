$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/facebooklogin.feature");
formatter.feature({
  "name": "Facebook login selenium",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "FB login Test Case 1",
  "description": "",
  "keyword": "Scenario Outline",
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
formatter.step({
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "user lands on Dashboard page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "ayyappa.thalla@gmail.com",
        "Iyyappa@123"
      ]
    },
    {
      "cells": [
        "thalla.ayyappa@gmail.com",
        "Iyyappa@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "FB login Test Case 1",
  "description": "",
  "keyword": "Scenario Outline",
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
  "status": "skipped"
});
formatter.step({
  "name": "user enters ayyappa.thalla@gmail.com and Iyyappa@123",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.FBLoginSteps.user_enters_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.FBLoginSteps.clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user lands on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.FBLoginSteps.user_lands_on_Dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "FB login Test Case 1",
  "description": "",
  "keyword": "Scenario Outline",
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
  "status": "skipped"
});
formatter.step({
  "name": "user enters thalla.ayyappa@gmail.com and Iyyappa@123",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.FBLoginSteps.user_enters_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.FBLoginSteps.clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user lands on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.FBLoginSteps.user_lands_on_Dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
});