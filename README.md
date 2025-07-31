#  WeatherApp Java Project

A simple yet effective Java application that retrieves and displays weather forecast data using the OpenWeatherMap API. Designed to demonstrate API consumption, JSON parsing, and modular programming.

##  Features

- Connects to the OpenWeatherMap API using latitude and longitude
- Parses JSON response to extract key weather details:
  - City name
  - Temperature (°C)
  - Weather description
  - Humidity (%)
  - Wind speed (m/s)
- Capitalizes weather descriptions for readability
- Handles connection and input stream gracefully

##  API Info

- Endpoint: `http://api.openweathermap.org/data/2.5/forecast`
- Location: Latitude `44.34`, Longitude `10.99`
- API Key: Stored securely within the code (replace with your own for production)

##  Project Structure
WeatherApp/ │ ├── WeatherApp.java       // Main Java class with logic for API call, JSON parsing, and output └── README.md             // Project documentation

##  How to Run

1. Compile the code:
javac WeatherApp.java

2. Execute the program:


java WeatherApp

3. View weather output printed in the console.

##  Dependencies

- Java Standard Library (no external dependencies except built-in `java.net`, `java.io`)
- JSON parsing via `org.json.JSONObject` (ensure you include the appropriate JSON JAR in your classpath)

##  Note on API Key

For security and best practices:
- Avoid hard-coding the API key in production.
- Consider loading it from environment variables or configuration files.

##  License

This project is open-source under the MIT License.



