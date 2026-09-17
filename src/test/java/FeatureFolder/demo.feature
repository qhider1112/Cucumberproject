Feature: Install Instagram from Google Play Store via Google Apps Menu
  @playstore @1
  Scenario: Navigate through Google apps to install Instagram
    Given the browser window is maximized
    When the user navigates to the Google homepage
    And the user clicks on the Google apps icon
    Then the user should be able to switch to the app iframe
    When the user clicks on the Play icon
    And the user switches back to default content
    And the user clicks on the Apps button
    And the user scrolls down the page
    And the user clicks on the Instagram icon
    And the user scrolls down again
    Then the user clicks the Install button

  @Flipkart @1
  Scenario Outline: Flipkart add to cart button check
    Given User open the browser and open flipkart url
    Then search for an "<Key>" in the search bar
    Then select the brand filter
    Then click an item to go into the item page
    And click the add to cart button
    Examples:
      | Key       |
      | flipkart1 |
      | flipkart2 |
      | flipkart3 |




  @login @1
  Scenario Outline: Login check for Facebook users
    Given user opens the facebook browser
    Then user navigates to the Facebook url
    Then enter "<Username>" in the fb username field
    And enter "<Password>" in the fb password field
    Then click on create an account "<S.no>"
    #Then click the fb login button
    Then exit fb webpage

    Examples:
      |S.no  | Username            | Password   |
      | 1    | faizal@gmail.com   | faizal@2345 |
      | 2    | vijay@gmail.com    | vj@67890    |


  @GoogleApps @1
  Scenario Outline: Launch and use a Google app from the Google Apps menu
    Given User open the browser and open google apps menu
    When User select the "<Key>" app option from csv
    Then perform the action for that app

    Examples:
      | Key   |
      | task1 |
      | task2 |
      | task3 |
      | task4 |


