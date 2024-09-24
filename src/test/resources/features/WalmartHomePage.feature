Feature: Walmart Menu Link Test
I want to test Walmart menu Links

Background:
Given I go to Walmart Home page

#Scenario: File Link test
#When I click on the File link
#Then I see the File page

#Scenario: Pay Link test
#When I click on the Pay link
#Then I see the Pay page

#Scenario: Refunds Link test
#When: I click on the Refunds link
#Then: I see the Refunds page

Scenario Outline: Testing different Walmart menu links     
	When I click on the Walmart"<walmartMenuLinkText>" link     
	Then I see the Walmart "<walmartMenuLinkPage>" page 
 
  Examples:        
  |walmartMenuLinkText|walmartMenuLinkPage|
  |Departments|Departments|
  |Services|Services|
  
  