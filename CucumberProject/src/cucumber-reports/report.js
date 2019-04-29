$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/Payment.feature");
formatter.feature({
  "name": "Paying for product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The one where the user added atleast one product to the cart and performing the payment to successful order",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Lalitha added a headphone to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "CaseStudy2_Paying.Lalitha_added_a_headphone_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "checkout for the payment",
  "keyword": "And "
});
formatter.match({
  "location": "CaseStudy2_Paying.checkout_for_the_payment()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: timeout\n  (Session info: chrome\u003d73.0.3683.103)\n  (Driver info: chromedriver\u003d2.46.628402 (536cd7adbad73a3783fdc2cab92ab2ba7ec361e1),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027BDC6-DX-J0G79F2\u0027, ip: \u002710.116.242.61\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628402 (536cd7adbad73a..., userDataDir: C:\\Users\\TRAINI~1.03\\AppDat...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:49546}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 73.0.3683.103, webStorageEnabled: true}\nSession ID: c5628407e874aa841fa570c1b6963ce9\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat skeleton.CaseStudy2_Paying.checkout_for_the_payment(CaseStudy2_Paying.java:50)\r\n\tat ✽.checkout for the payment(file:src/test/resources/skeleton/Payment.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the product is successfully orderd",
  "keyword": "Then "
});
formatter.match({
  "location": "CaseStudy2_Paying.the_product_is_successfully_orderd()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});