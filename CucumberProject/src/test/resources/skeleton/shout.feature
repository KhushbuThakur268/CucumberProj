Feature: Shout Feature 
Scenario: Sean shouts
	Given Sean is 10 meter away from Lucia
	When Sean shouts "Free Coffee"
	Then Lucia "listen" to the message

Scenario: Sean shouts away from Lucia
    Given Sean is 110 meter away from Lucia
    When Sean shouts "Free Coffee"
    Then Lucia "can't listen" to the message