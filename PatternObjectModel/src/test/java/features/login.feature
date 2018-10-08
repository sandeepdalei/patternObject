Feature: Login To LeafTaps

Scenario Outline: out Login with Demo Administer
And Enter the User Name as <uName>
And Enter the password as <pwd>
When click on the Login Button
Then Login should be successful
Examples:
|uName|pwd|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|

Scenario Outline:: out Login with Demo Administer
And Enter the User Name as <uName>
And Enter the password as <pwd>
When click on the Login Button
But validate whether the login is successful or not
Examples:
|uName|pwd|
|pops|crmsfa|
|DemoCSR|1256|
