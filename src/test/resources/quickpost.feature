Feature: Quick Post

As a guest user
I want to post a ride
So that any employee going to my direction can join me

Scenario: Successful posting
Given Guest User enter all correct data
When click on "Submit"
Then System display message "Posting is successful"

@work
Scenario: Invalid Time
Given Guest User enter all correct data except time
And Time enetered as "42.30AM"
When click on "Submit"
Then System display message "Posting is unsuccessful"
And redirected user to "Home" page

