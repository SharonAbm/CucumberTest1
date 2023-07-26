Feature: Send Email


  Scenario Outline: Send Email to user
    Given User must launch the application
    When User should send email to register
    
    """
    Hello <user>
    
    Welcome to our community !...
    
     Click on the below link for registration...
     
     
     From support team
     
     """


    Examples: 
      | user |
      | testuser1|
      | testuser2 |
