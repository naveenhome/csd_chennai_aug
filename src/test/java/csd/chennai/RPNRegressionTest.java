package csd.chennai;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RPNRegressionTest extends TestCase{
	String input;
	@Given("^user enter \"([^\"]*)\"$")
	public void user_enter(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		input = arg1;
	}

	@Then("^system show \"([^\"]*)\"$")
	public void system_show(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		RPNcalc calc = new RPNcalc();
		assertEquals(Integer.parseInt(arg1), calc.Calculate(input));
	}

}
