@PhaseThree
Feature: Deals Management
CRUD Operations for Deals


@SmokeTest 
Scenario: Create a Deals
Given User is logged in
When User create a deals

@SmokeTest @RegressionTest
Scenario: Update a Deals
Given User is logged in
When User update a deals

Scenario: Delete a Deals
Given User is logged in
When User delete a deals