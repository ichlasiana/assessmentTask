@bookReservation
  Feature: Book table reservation
    As a user i want to book table reservation with 7 people

  Scenario: Happy flow
    Given User open the website KWC Automated
    When User select 'Make a Reservation' button
    And User select an available date
    And User select guests to 7 people
    And User select 'Search for Reservation' button
    And User select at 03.00 PM for Lunch
    And User select '2 Hours 15 Minutes' in full experience section
    And User select 'A5 Wagyu Brisket' for reservation supplements
    And User select 'Confirm Selection' button
    And User input all required field, Dietary Restriction and Special Occasion in reservation details
    And User select 'Proceed to add payment details' button
    And User input all required field in payment details
    And User select 'Confirm Reservation' button
    And User want to become a member, and select 'Yes, join the program'
    And User select 'Done' button
    Then User already confirmed for reservation



