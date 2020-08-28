@loginPage
Feature: User Management page log in
  Background: Open user registration page
    Given I open "http://automation.techleadacademy.io/#/usermgt"


  //Task:
  //Write a scenario for Log in functionality
  //- When you enter credentials of mentor,
 // you should land on page with a title "Mentor Page"
  //Instructor -> title: Instructor Page
  //Student -> title: Student Page
  //- Use credentials from Use DB page, no need to automate
  //process of getting credentials.




  @login
  Scenario: Log in as John Smith
    When I input "student@techleadacademy.io" as a "username"
    And I input "john.smith$" as a "password"
    And I click a button "Login"
  @login1
  Scenario: Log in as Stephanie Adams
    When I input "mentor@techleadacademy.io" as a "username"
    And I input "stephanie.adams$" as a "password"
    And I click a button "Login"
  @login2
  Scenario: Log in as Kate Anderson
    When I input "instructor@techleadacademy.io" as a "username"
    And I input "kate.anderson$" as a "password"
    And I click a button "Login"


