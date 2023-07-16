Feature: Nature Feature
Scenario Outline: Nature Scenario


Given User is exist on Google Page
When I Search For Selenium "<SearchText>"
And  I refresh the browser
And Make this step fail
Then I close the browser

Examples:
|SearchText|
|Selenium|
