Feature: Post feature of facebook
  This will test the functionality at the user wall
  Background: This is for common steps
    Given User should be logged in and should be present at its own wall

    Scenario: Post a message on user wall
      When I type the message as"My Post" in the text box
      And Click on post button
      Then The message should get posted

      Scenario: Post a video on user wall
        When User supply the youtube link as "https://www.google.co.uk/" in the text box
        And Click on post button