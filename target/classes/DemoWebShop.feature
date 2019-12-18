
@tag
Feature: DemoWebShop


  @registration 
  Scenario: registration for user
    Given  DemoWebShop website is launced
    And user click on register button
    And user filled gender details
    And frist name
    And lastName
    And email id
    Then fiiled password
    And confirrmed password
    Then click on register
    Then log out

  @login
  Scenario: login
    Given user click on login button to enter data
    And   filled email id
    And password
    When click on sumbit button to send data 
    

  @search 
  Scenario: search item to buy
    Given click on search item box
    And enter desire product
    And enter
    
    
  @search 
  Scenario: AddToCart
    Given click on add to cart
    And   go to shooping cart
    Then check out product
    