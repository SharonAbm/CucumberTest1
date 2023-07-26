@PhaseOne
Feature: Task Management
CRUD Operations for Task

@SmokeTest
Scenario: Create a Task
Given User is logged in
When User create a task

@RegressionTest
Scenario: Update a Task
Given User is logged in
When User update a task

Scenario: Delete a Task
Given User is logged in
When User delete a task

