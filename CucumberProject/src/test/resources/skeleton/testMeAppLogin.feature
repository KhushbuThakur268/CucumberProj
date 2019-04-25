Feature: Test_Me App Login Feature
Scenario: Login Scenario
    Given Enter the URL of Test_Me App
    When Enter data for Login
   # And  User enters "Password456" as password
    And  User click on Login
    Then User enters into Admin Home page
    
Scenario: Add new products
    Given Enter the Add Product page
    When Click on Add Product
    And Enter data for Adding Product
    #And Select "Electronics" as Category Name
    #And Select "Laptops" as Sub Category Name
    #And Enter "Dell Laptop" as Product Name
    #And Enter 50000 as Price
    #And Enter 1 as Quantity
    #And Enter "Dell" as Brand
    #And Enter "Dell RT2350" as Description
    And Click on Add Product
    Then Product Successfully Added   