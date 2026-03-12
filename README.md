# Flipkart Automation

This repository contains a Selenium-WebDriver based test automation project for the Flipkart website.

## Project Structure

```
flipkart-automation/
    pom.xml
    testng.xml
    src/
        main/
            java/                # production code (if any)
            resources/
        test/
            java/
                base/            # base test classes
                pages/           # Page Object Model classes
                tests/           # TestNG test classes
                utils/           # helpers (config, logging, excel, etc.)
            resources/
                config/          # configuration properties
                extent/          # ExtentReports configuration
                testdata/        # test data files
```

## Prerequisites

- Java 8+ or higher
- Maven 3.6+ installed
- ChromeDriver or other WebDriver executable on PATH

## Setup

1. Clone the repository:
   ```bash
   git clone <repo-url>
   cd flipkart-automation
   ```
2. Update `src/test/resources/config/config.properties` with required settings (e.g., browser, base URL).
3. Ensure the WebDriver binary is available and matches the installed browser version.

## Running Tests

Execute the following command from project root:

```bash
mvn clean test
```

or run individual test classes via your IDE.

Reports and logs are generated under `target/surefire-reports`, `logs/`, and `src/test/resources/extent`.

## Utilities

- `ConfigReader` – reads properties file
- `ExcelReader` – handles Excel test data
- `ExtentManager` – manages ExtentReports
- `LoggerUtil` – wrapper around Log4j2
- `ScreenshotUtils` – captures screenshots on failure

## Contributing

Feel free to open issues or submit pull requests.

## License

This project is for demonstration purposes and has no specific license.
