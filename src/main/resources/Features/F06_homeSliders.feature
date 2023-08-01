@smoked
Feature:  F06_HomeSliders | users clicks on Home Page sliders

  Scenario: first slider is clickable on home page

    #Given user go to Home page
    When user clicks on first slider
    Then direct user to first slider url "https://demo.nopcommerce.com/nokia-lumia-1020"


  Scenario: second slider is clickable on home page

    #Given user go to Home page
    When user clicks on second slider
    Then direct user to second slider url "https://demo.nopcommerce.com/iphone-6"