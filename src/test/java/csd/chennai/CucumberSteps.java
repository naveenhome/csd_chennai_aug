package csd.chennai;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase{
	Ride ride = new Ride();
	String actionButton;
	@Given("^Guest User enter all correct data$")
	public void Guest_User_enter_all_correct_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setName("Naveen");
		ride.setEmail("naveen.singh@leanpitch.com");
		ride.setPhone("9810547500");
		ride.setTime("5.30");
		ride.setSource("Adyar");
		ride.setDestination("Airport");
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String buttonName) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		actionButton=buttonName;
	}

	@Then("^System display message \"([^\"]*)\"$")
	public void System_display_message(String expectedMessage) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		RideValidator rideValidator = new RideValidator();
		
		if(actionButton.equals("Submit"))
		{
			assertEquals(expectedMessage, rideValidator.SaveRide(ride));
		}
	}

	@Given("^Guest User enter all correct data except time$")
	public void Guest_User_enter_all_correct_data_except_time() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Given("^Time enetered as \"([^\"]*)\"$")
	public void Time_enetered_as(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^redirected user to \"([^\"]*)\" page$")
	public void redirected_user_to_page(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}


}
