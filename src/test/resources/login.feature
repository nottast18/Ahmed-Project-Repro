Feature: Walgreens login functionality.
	@Debug
	Scenario: 1. Valid user with valid user name and password.

		Given  user click on Your Account button.
		Then   user click on Sing in button.
		When   user enter user email as "chowdhurytaeem@gmail.com"
		When   user click on Continue button.
		Then   user enter password as "nottast@18"
		Then   User click sing in button.
		Then   login success message display.

