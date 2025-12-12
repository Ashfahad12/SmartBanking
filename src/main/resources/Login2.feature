@Smoke @Functional @Regression
Feature: Login function test

@SB-5 @SB-6 @SB-7 @SB-13 @SB-15 @SB-17 @SB-19
Scenario Outline: As a smarttech online bankin user, i will check login function with valid & invalid credentials

Given opened the browser
And go to application login page
When enter Username "<Username>"
And enter Password "<Password>"
And click the login button
Then check login pass or fail

Examples:
|Username	|Password		|
|Batch44	|student123@	|
|wronguser	|wrongpass		|
|wronguser	|student123@	|
|Batch44	|wrongpass		|
|			|				|
|			|student123@	|
|Batch44	|				|
