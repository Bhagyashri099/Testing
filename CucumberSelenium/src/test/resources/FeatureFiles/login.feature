Feature: Login Test


Scenario Outline: Login for FlightBooking
Given user opens the url
When user clicks on login button
And user enters mobileNo <mob no> 
Then user clicks continue
When user enters <source> and <destination>
When user clicks on search 


Example:
|mob_no| source | destination|
|9359751866| pune | mumbai | 






