# Saudi Digital Banking QA Framework

A portfolio project that documents a simulated digital-banking account-opening test effort. It brings together test planning, example test cases, API notes, SQL validation queries, defect tracking, and sample Selenium/TestNG code.

## Scope

The documented scenarios cover:

- Login
- Customer registration
- National ID validation
- OTP verification
- Account opening
- Dashboard access

## Repository contents

- `Documents-TestPlan.md` — test scope, entry criteria, and exit criteria
- `Documents/` — business requirements
- `TestCases/` — example login, registration, and OTP test cases
- `API/` — API notes for account creation and OTP
- `SQL/` — sample database validation queries
- `Defects/` — example defect log
- `Reports/` — sample test summary
- `Automation/` and `Autopages/` — sample Selenium/TestNG test and page-object code

## Tools represented

Java, Selenium WebDriver, TestNG, Postman, SQL, and GitHub Actions are referenced in the project materials.

## Current limitations

This repository is a demonstration/test-design project, not evidence of testing a live banking system. The Selenium example currently uses a placeholder URL and needs a configured WebDriver and target application before it can run. The repository also does not currently include a Maven `pom.xml`, so the existing workflow should not be treated as a passing CI pipeline.

## Suggested review path

1. Read the test plan and business requirements.
2. Review the test cases and API notes.
3. Inspect the SQL validation examples and defect log.
4. Treat the automation files as starter examples until the target application and build configuration are supplied.
