$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:login.feature");
formatter.feature({
  "name": "Walgreens login functionality.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "1. Valid user with valid user name and password.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Debug"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click on Your Account button.",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_click_on_Your_Account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Sing in button.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_click_on_Sing_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter user email as \"chowdhurytaeem@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enter_user_email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Continue button.",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_click_on_Continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter password as \"nottast@18\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click sing in button.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_click_sing_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login success message display.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.login_success_message_display()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});