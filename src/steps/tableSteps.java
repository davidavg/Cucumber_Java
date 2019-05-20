package steps;

import java.util.List;
import java.util.Map;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

public class tableSteps extends BaseUtil {
	
	private BaseUtil base;
	
	public tableSteps(BaseUtil base) {
		System.out.println("This is the constructor for tableSteps");
		this.base = base;
	}
	
	@Given("^I want to test tables")
	public void i_want_to_test_tables() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given step executed...");
	    //System.out.println(base.testInfo);
	}
	
	@Given("^I want to test outline")
	public void i_want_to_test_outline() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given outline step executed...");
	}
	
	@Then("^I want to print outputs")
	public void I_want_to_print_outputs(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    List<String> list = table.asList();
		for(int i = 0; i <list.size();i+=2) {
			System.out.println("Then step executed... \n ID - " +list.get(i) + "\n Text - " + list.get(i+1) );
		}	    
	}
	
	@Then("^I want to print tableHeaders")
	public void I_want_to_print_tableHeaders(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    List<Map<String,String>> list = table.asMaps();
		for(int i = 0; i <list.size();i++) {
			System.out.println("Then step executed... \n ID - " +list.get(i).get("ID") + "\n Text - " + list.get(i).get("Text") );
		}    
	}
	
	@Then("^I want to print ([^\"]*) and ([^\"]*)")
	public void I_want_to_print_outline(String id, String text) { 
		System.out.println("Testing ...\nID - " + id + "\ntext - " +text);
	}
}
