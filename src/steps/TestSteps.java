package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	
	@Given("I want to test cucumber")
	public void i_want_to_test_cucumber() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given step executed...");
	}
	
	@When("I run the test")
	public void i_run_the_test() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("When Step executed...");
	}

	@Then("{string} is printed")
	public void text_is_printed(String text) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Then step executed... " + text);
	}

}
