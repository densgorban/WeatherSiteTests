Description: perform functional API tests against web resource api.openweathermap.org

# Call current weather data for one location
User Story 1 (Scrum):
As a User I want to GET Weather info, successful status By known city name and region
User Story 2 (Scrum):
As a User with incorrect auth id I want to GET 401 response status and informative error message
User Story 3 (Scrum):
As a User I want to GET Weather info in both JSON or XML body
## Scenario: GET By city ID
Given {citi_id} and {country_code),
When GET Weather info,
Then data should satisfy the same Citi on weather.com
## Scenario: GET By geographic coordinates
Given Coordinates {lon} and {lat),
When GET Weather info,
Then data should satisfy the same Citi on weather.com
## Scenario: GET By ZIP code

# Call current weather data for several cities
## Cities within a rectangle zone
## Cities in cycle
## Call for several city IDs