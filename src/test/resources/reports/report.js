$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "Verify the login functionality of Adactin app",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in adactin login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginexecution.user_is_in_adactin_login_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the login functionality of Adactin app",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter the username \"Ashlinkmathy\" and password \"Z58859\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginexecution.enter_the_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginexecution.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify user name and password",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginexecution.verify_user_name_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/lphome.feature");
formatter.feature({
  "name": "Verify Home screen functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Home screen functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter the login details \"Ashlinkmathy\" and \"Z58859\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LpHomeexecution.enter_the_login_details_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "IUser is on Home screen",
  "keyword": "When "
});
formatter.match({
  "location": "LpHomeexecution.iuser_is_on_Home_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the home screen dropdowns",
  "keyword": "Then "
});
formatter.match({
  "location": "LpHomeexecution.i_validate_the_home_screen_dropdowns()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/lqth.feature");
formatter.feature({
  "name": "Validate the Select hotel page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the Select hotel page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in Select hotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "lqSelecthotel.userIsInSelectHotelPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the Radio button",
  "keyword": "When "
});
formatter.match({
  "location": "lqSelecthotel.userSelectTheRadioButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "lqSelecthotel.userClickOnContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/lqwbookhotel.feature");
formatter.feature({
  "name": "Verify user can able to book the Hotel",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the Bookhotel screen",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in book hotel screen",
  "keyword": "Given "
});
formatter.match({
  "location": "Searchbookhotel.userIsInBookHotelScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the details and click on book now button",
  "keyword": "When "
});
formatter.match({
  "location": "Searchbookhotel.userSelectTheDetailsAndClickOnBookNowButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the booking number generated or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Searchbookhotel.verifyTheBookingNumberGeneratedOrNot()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});