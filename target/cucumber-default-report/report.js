$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ExelExample.feature");
formatter.feature({
  "name": "Add multiple employees",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ExcelExample1"
    }
  ]
});
formatter.scenario({
  "name": "Using excel sheet with multi data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ExcelExample1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user lot in to hrms appliction",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.ExcelExm1.user_lot_in_to_hrms_appliction()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#txtUsername\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-0SQOIF4\u0027, ip: \u0027192.168.1.93\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\User\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:62554}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 4d25c5de79d4268a2f8944629d74a006\n*** Element info: {Using\u003did, value\u003dtxtUsername}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.hrms.steps.ExcelExm1.user_lot_in_to_hrms_appliction(ExcelExm1.java:37)\r\n\tat ✽.user lot in to hrms appliction(file:///C:/Users/User/eclipse-workspace/ZJawidCucumberNewProject2/src/test/resources/features/ExelExample.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user uses excel path of \"C:\\Users\\User\\eclipse-workspace\\ZJawidCucumberNewProject2\\src\\test\\resources\\testdata\\PracticeExcelFile.xlsx\" and sheet from \"JawidSheet\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.ExcelExm1.user_uses_excel_path_of_and_sheet_from(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user vlaid invalide and valid message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.ExcelExm1.user_vlaid_invalide_and_valid_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});