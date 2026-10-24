# Saudi Digital Banking QA Framework

A QA portfolio project documenting a simulated digital-banking account-opening test effort. It combines test planning artifacts with starter Selenium/TestNG automation and a small unit test for the login page object.

## Scope

The documented scenarios cover login, customer registration, national ID validation, OTP verification, account opening, and dashboard access.

## Repository contents

- `Documents-TestPlan.md` — test scope and entry/exit criteria
- `Documents/` — business requirements
- `TestCases/` — example login, registration, and OTP test cases
- `API/` — account-creation and OTP API notes
- `SQL/` — sample database validation queries
- `Defects/` — example defect log
- `Reports/` — sample test summary
- `Automation/` and `Autopages/` — starter Selenium/TestNG code
- `pom.xml` — Maven dependencies and test configuration

## Run automated checks

Requires JDK 17 and Maven.

```bash
mvn test
```

The unit test checks that the login page object sends credentials to the expected fields and clicks the login button. The browser-based login test is skipped unless all three environment variables are provided:

- `TARGET_LOGIN_URL`
- `TEST_USERNAME`
- `TEST_PASSWORD`

When a permitted target test application is available, configure those variables to run the browser test. The current default URL in earlier examples was a placeholder, so this repository does not claim a successful end-to-end test against a live banking application.

## CI

GitHub Actions runs `mvn test` on pushes and pull requests targeting `main`. The browser test is expected to be skipped when target credentials and URL are not configured; the page-object unit test should run independently.

## Scope and limitations

This is a test-design and automation portfolio exercise, not evidence of testing a real bank or production banking system. The scenarios and sample artifacts should be adapted and validated against an authorized test environment before being used for actual delivery.
