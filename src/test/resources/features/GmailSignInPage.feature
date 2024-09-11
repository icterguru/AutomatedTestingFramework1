Feature: Gmail Sign In Link Test
As a gmail user I  want to test Gmail Sign In Links

Background:
Given I go to Gmail Sign In  page

Scenario: Google Account test
When I enter my email address and password
And I click on the Next button
Then I can sign in my account
