$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/registration.feature");
formatter.feature({
  "line": 2,
  "name": "Registration feature",
  "description": "",
  "id": "registration-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 11932872200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should able to register successfully,",
  "description": "so that user can use all user functionality on my website",
  "id": "registration-feature;user-should-able-to-register-successfully,",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test"
    },
    {
      "line": 4,
      "name": "@smoke"
    },
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@trial"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on register button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user enter all required registration details",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Clicks on register-submit button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should be able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTestDefts.user_is_on_homepage()"
});
formatter.result({
  "duration": 939537700,
  "status": "passed"
});
formatter.match({
  "location": "MyTestDefts.user_clicks_on_register_button()"
});
formatter.result({
  "duration": 2047142600,
  "status": "passed"
});
formatter.match({
  "location": "MyTestDefts.user_enter_all_required_registration_details()"
});
formatter.result({
  "duration": 1992762600,
  "status": "passed"
});
formatter.match({
  "location": "MyTestDefts.user_Clicks_on_register_submit_button()"
});
formatter.result({
  "duration": 2395846800,
  "status": "passed"
});
formatter.match({
  "location": "MyTestDefts.user_should_be_able_to_register_successfully()"
});
formatter.result({
  "duration": 136611100,
  "status": "passed"
});
formatter.after({
  "duration": 396939600,
  "status": "passed"
});
});