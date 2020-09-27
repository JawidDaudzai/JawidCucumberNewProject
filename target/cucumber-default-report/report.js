$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ThreeUserNamePractice.feature");
formatter.feature({
  "name": "Functionality test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Positive"
    }
  ]
});
formatter.scenario({
  "name": "positive test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Positive"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user log in to HRMS application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.PositiveNegativeTest.user_log_in_to_HRMS_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"admin\" and \"Hum@nhrm123\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.PositiveNegativeTest.user_enters_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates \"Welcome Admin\" text is available",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.PositiveNegativeTest.user_validates_text_is_available(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "negative test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Positive"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user log in to HRMS application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.PositiveNegativeTest.user_log_in_to_HRMS_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"admin\" and \"Hum@nhrm1233\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.PositiveNegativeTest.user_enters_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates \"Welcome Admin\" text is available",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.PositiveNegativeTest.user_validates_text_is_available(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[text()\u003d\u0027Welcome Admin\u0027]\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-0SQOIF4\u0027, ip: \u0027192.168.1.93\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\User\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:54923}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 89c57533ea1adbe098e90c557d92291f\n*** Element info: {Using\u003dxpath, value\u003d//a[text()\u003d\u0027Welcome Admin\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.hrms.steps.PositiveNegativeTest.user_validates_text_is_available(PositiveNegativeTest.java:41)\r\n\tat ✽.user validates \"Welcome Admin\" text is available(file:///C:/Users/User/eclipse-workspace/ZJawidCucumberNewProject2/src/test/resources/features/ThreeUserNamePractice.feature:13)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});