@Smoke @Functional @Regressional
Feature: Login functionality test for Smart Banking
Description: Validating login functions with positive and negative scenarios
	
Background: 
	Given opened the browser
    And go to application login page
  
  @Positive @SB-5
  Scenario: Login should pass with valid credentials
    When enter valid username
    And enter valid password
    And click the login button
    Then login should pass & logout button should be visible

  @Negative @SB-6
  Scenario: Login should not pass with invalid credentials
    When enter invalid username
    And enter invalid password
    And click the login button
    Then login should fail & invalid username or password message should be visible
    
  @Negative @SB-7
  Scenario: Login should not pass with invalid username and valid password
    When enter invalid username
    And enter valid password
    And click the login button
    Then login should fail & invalid username or password message should be visible
    
  @Negative @SB-13
  Scenario: Login should not pass with valid username and invalid password
    When enter valid username
    And enter invalid password
    And click the login button
    Then login should fail & invalid username or password message should be visible
    
  @Negative @SB-15
  Scenario: Login should not pass with null username and null password
    When enter null username
    And enter null password
    And click the login button
    Then login should fail & invalid username or password message should be visible
    
  @Negative @SB-19
  Scenario: Login should not pass with valid username and null password
    When enter valid username
    And enter null password
    And click the login button
    Then login should fail & invalid username or password message should be visible
    
  @Negative @SB-17
  Scenario: Login should not pass with null username and valid password
    When enter null username
    And enter valid password
    And click the login button
    Then login should fail & invalid username or password message should be visible
    
    