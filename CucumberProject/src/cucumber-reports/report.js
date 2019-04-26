$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/testMeAppLogin.feature");
formatter.feature({
  "name": "Test_Me App Login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login Scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter the URL of Test_Me App",
  "keyword": "Given "
});
formatter.match({
  "location": "Test_MeAppStepDefn.enter_the_URL_of_Test_Me_App()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter data for Login",
  "keyword": "When "
});
formatter.match({
  "location": "Test_MeAppStepDefn.enter_data_for_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Test_MeAppStepDefn.user_click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters into Admin Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_MeAppStepDefn.user_enters_into_Admin_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Add Product page",
  "keyword": "Given "
});
formatter.match({
  "location": "Test_MeAppStepDefn.enter_the_Add_Product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product Successfully Added",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_MeAppStepDefn.product_Successfully_Added()"
});
formatter.result({
  "status": "passed"
});
});