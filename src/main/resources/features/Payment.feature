@Smoke @Functional @Regression
Feature: Payment Functionality Test  
Scenario: Payment should be successful when add to cart and checkout

Given Open any browser
And  Go to application link
When Select product quantity to four
And  Click buy now
And  Add Credit card information
And  Click submit order
Then Order should be successful and order id should be generated  
