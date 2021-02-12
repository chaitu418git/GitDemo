Feature: Application Login

Scenario: To test Application Login
Given User is on Landing page
When User enters username "john" and Password "1234"
Then User should be landing Page
And Cards displayed are "true"

Scenario: To test Application Login
Given User is on Landing page
When User enters username "jillu" and Password "1476"
Then User should be landing Page
And Cards displayed are "false"