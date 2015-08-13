package csd.chennai;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class rpnsteps extends TestCase {
	String expr;
	@Given("^user enter data like \"([^\"]*)\"$")
	public void user_enter_data_like(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		expr = arg1;
	}

	@Then("^system should show result as \"([^\"]*)\"$")
	public void system_should_show_result_as(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		RPNcalc calc = new RPNcalc();
		assertEquals(Integer.parseInt(arg1),  calc.Calculate(expr));
	}

}
