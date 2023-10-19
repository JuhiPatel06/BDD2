Feature: Post feature of facebook
  This will test the functionality of the user wall

  Scenario: Post a message on user wall
    Given User should be logged in and should be present at its own wall
    When I type the message in and the text box
    And Click on post button
    Then The message should get posted

    Scenario: Post a video on user wall
      Given User should be logged in and should be present at its own wall
      When User supply the youtube link in the text box
      And Click on post button
      Then Then video should get posted on the user wall
      And the video should have proper thumbnail