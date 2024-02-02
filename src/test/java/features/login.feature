Feature: Login Feature
  @regression
  Scenario: User should be able to login with valid email and valid password
    Given user in TalentTEK Homepage
    And user enter valid email address
    And user enter valid password
    When user clicks on login button
    Then the user should be able to login successfully

#  @regression
#  Scenario: User should be able to login with invalid email and invalid password
#    Given user in TalentTEK Homepage
#    And user enter invaild email address
#    And user enter invalid password
#    When user clicks on login button
#    Then user should see "Invalid email address" error message.
#
#  Scenario: User should not be able to login with valid email and invalid password
#    Given user in TalentTEK Homepage
#    And user enter valid email address
#    And user enter invalid password
#    When user clicks on login button
#    Then user should see "Incorrect email or password" error message.
#
#  Scenario: User should not be able to login with invalid email and valid password
#    Given user in TalentTEK Homepage
#    And user enter invalid email address
#    And user enter valid password
#    When user clicks on login button
#    Then user should see "Invalid email address" error message.
#  @regression
#  Scenario: User should not be able to login with empty fields
#    Given user in TalentTEK Homepage
#    And user submit email address and password field empty
#    When User clicks on login button
#    Then User should see "please fill out field" message.
#  @regression
#  Scenario: Account Locking after Multiple Failed Attempts
#    Given the user is on TalentTEK Homepage
#    And the user enters incorrect credentials multiple times
#    When User clicks on login button
#    Then the account should be locked
#
#  Scenario:User should not be able to login with Case Insensitivity
#    Given the user is on TalentTEK Homepage
#    And User enter the username and password with a mix of uppercase and lowercase characters
#    When User clicks on login button
#    Then user should see "Invalid email address" error message.
#
#  Scenario:User should be able to Simultaneous Logins
#    Given the user is on TalentTEK Homepage in different device
#    And Attempt to log in with the same credentials from multiple devices simultaneously.
#    When User clicks on login button from multiple device
#    Then the user should be logged in successfully login in all device.
#
#  Scenario: Account Locking after Multiple Failed Attempts with correct email address and multiple incorrect password
#    Given the user is on TalentTEK Homepage
#    And the user enters correct email address in username field
#    And user enter incorrect password multiple times
#    When User clicks on login button multiple times
#    Then the account is not be locked
#
#  Scenario: Account Locking after Multiple Failed Attempts with incorrect email address and correct password
#    Given the user is on TalentTEK Homepage
#    And the user enters incorrect email address in username field multiple times
#    And user enter correct password
#    When User clicks on login button multiple times
#    Then the account is not be locked
#  @smoke @regression
#  Scenario: Password Recovery
#    Given the user is on TalentTEK Homepage
#    When the user clicks on the "Forgot Password" link
#    And provides the necessary information for password recovery
#    Then the user should be able to reset the password
