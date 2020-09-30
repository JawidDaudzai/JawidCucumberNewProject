$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/YouTubePage.feature");
formatter.feature({
  "name": "YouTube",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@MyYouTubeRegression"
    }
  ]
});
formatter.scenario({
  "name": "YouTube page is opened",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MyYouTubeRegression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens YouTube page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.YouTube.user_opens_YouTube_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});