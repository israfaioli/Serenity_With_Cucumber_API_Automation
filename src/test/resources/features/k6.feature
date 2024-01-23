Feature: Collection of HTTP and WebSocket APIs for experimentation with k6

  Background:
    Given content-type and baseURI are already acquired

  Scenario: List all public crocodiles.
    When User see all "public/crocodiles/" list
    Then User see response has 200 status code