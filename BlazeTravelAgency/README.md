BLAZEDEMO ~ BOOKING A FLIGHT TICKET 

RUN INSTRUCTIONS
================

Tests can be executed by running the testNG.xml file

(or)

Tests can be triggered from commandLine using mvn command:
mvn clean test -DsuiteXmlFiles=testng.xml


Test Scenarios
==============

There are number of test scenarios that can be automated with 
positive and negative validations for the each of the following pages:
a) Home Page
b) Reserve Page
c) Purchase Page
d) Confirmation Page

I have chosen to automate the end-to-end happy flow of user searching 
with 
source and destination and chooses to pick the lowest priced airline 
for his journey and enter all the details to book a ticket and gets 
to see the confirmation of his booking.