Feature: Walgreens page functionality.
	#@Debug
	Scenario: 1. Drugprice details verify.

		Given  User move mouse in Rx Refills
		Then   User click on Druginformation button.
		When   User enter name in searchbox.
		When   User click on search button.
		Then   Verify user in DrugDetailspage.
		Then   User click View Drag details button.
		Then   User click price information button.
		Then   Verify price information details.

