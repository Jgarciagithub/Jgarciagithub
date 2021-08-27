# Autor: Jonatan

  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the choucair Academy with the automation course
  @scenario1
  Scenario: search for a automation course
    Given than brandon wants to learn automation at the academy choucair
    | strUser | strPassword |
    | <strUser>  | <strPassword> |
    When he search for the course on the choucair academy platform
    | strCourse   |
    | <strCourse> |
    Then he finds the course called resources
      | strCourse  |
      |<strCourse> |