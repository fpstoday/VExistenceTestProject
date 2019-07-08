Feature:  Check for existing vehicle drive away insurance details

Scenario: Check  with valid user input
Given  the user is on  https://covercheck.vwfsinsuranceportal.co.uk/
When the user enters valid Vehicle Registration Number: OV12UYY
When the user clicks on "Find vehicle"
Then the drive away insurance details for vehicle registration: OV12UYY is displayed.
And the user closes browser