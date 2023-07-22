#Author: Pallavi Srivastava
#Keywords Summary : Final Cerification Project
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#Test Scenarios done: 
#1. To verify the URL for Demo_blaze on Google browser
#2. To verify whether the site displays Greetings to the user.
#3. To verify that the user redirects to the sign up page
#4. To verify  that the user enters the valid user name


@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: User Signups Scenario
    Given User is on landing page
    When User clicks on Signup button
    And User enters username 
    And User enters password
    And User click Signup button
    Then user is navigated to Home page
    
   @tag2
   Scenario: Login Scenario
    Given User is on landing page
    When User clicks on Login button
    And User enters username 
    And User enters password
    And User click Signup button
    Then user is navigated to Welcome page
    
 
 