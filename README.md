📊 Project Structure Overview

Here is an explanation of the project structure:

Open Weather API/
│
├── Profiles/                   # Contains environment profiles for different test configurations (e.g., API keys, URLs).
│   └── default                 # Default profile settings for your tests.
│
├── Test Cases/                  # Contains the test case files for your API tests.
│   └── Get_Air_Polution         # API test for air pollution data.
│   └── Get_Weather_Forecast     # API test for weather forecast data.
│
├── Object Repository/           # Stores test objects for API requests.
│   └── API/
│       └── GetAirPollution      # REST API object for air pollution.
│       └── GetWeatherForecast   # REST API object for weather forecast.
│
├── Test Suites/                 # Organizes your test cases into suites for execution.
│   └── OpenWatherTestSuite      # Test suite combining the GetAirPollution and GetWeatherForecast tests.
│
├── Reports/                     # Contains the generated test execution reports.
│
├── Include/                     # Contains configurations, helper files, and schemas.
    └── schemas/
        └── AirPollutionSchema.json  # JSON schema for air pollution API.
        └── WeatherForecastSchema.json  # JSON schema for weather forecast API.
        
🚀 Steps to Run the Test Cases
1. Open Katalon Studio.
2. Go to File > Open Project and select the cloned project folder.
3. Execute the Test Suite:
    - Navigate to Test Suites > OpenWatherTestSuite.
    - Ensure the Execution Profile is Default
    - Click "Run" button

📊 How to Get the Test Report
1. Navigate to the Reports Folder: After running the tests, go to the Reports folder.
2. Open the Latest Report:
   - The report file will be named with the timestamp (e.g., 20250213_004105).
   - If you are using an enterprise katalon version, you can open the file directly.
   - If you are using free version, You must open the file via File Explorer
The report will include details like Test Case Execution, Status, and Logs.
