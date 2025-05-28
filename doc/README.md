## Final Assignment: UI Test Automation Framework – Warehouse Management System

## Objective

#### • Build	a	Test	Automation	Framework for	the	User	Management module	of	the Warehouse	Management	System	(WMS)	using	the	following	tools	and	design	pattern:
#### •  Maven – for	project	build	and	dependency	management
#### • Selenium	WebDriver – for	UI	automation
#### • Cucumber	BDD – for	behavior-driven	development
#### • Page	Object	Model	(POM) – for	maintainable	code	architecture

###  High-Level Requirement

**  Scenarios **

 1. View	Users	in	User	Management
 2. Add	New	User	in	User	Management	by	Client	Admin
 3. Add	New	User	in	User	Management	by	Super	Admin
 4. Suspend	User	in	User	Management
 5. Edit	User	in	User	Management
 6. Delete	User	in	User	Management
 7. Login	with	a	Suspended	Account
 8. Login	with	a	Deleted	Account


### � Framework Guidelines

```plaintext
Project Setup (Maven)

Standard Maven project	structure.
Proper	pom.xml with	required	dependencies:
    – Selenium
    – Cucumber Java
    – Cucumber TestNG
    – WebDriverManager
    – TestNG
    – Cucumber HTML report
```

### Folder Structure 

```plaintext

   WarehouseAutomation/
   ├── pom.xml
   ├── src/
   │ ├── main/
   │ │ └── java/
   │ │ └── pages/ # Page Object classes
   │ ├── test/
   │ │ ├── java/
   │ │ │ ├── stepdefinitions/ # Step definition classes
   │ │ │ └── runner/ 
   │ │ └── resources/
   │ │ └── features/ 

```
###  Feature File Standards

#### Example

```plaintext
Feature: Login with Suspended User Account
Background:
Given User is on the Login Page
Scenario: Suspended user login attempt
When User enters username "suspended.user@wms.app"
And User enters password "password123"
And User clicks on Login
Then A suspension message "Your account has been suspended" should be
displayed

