package steps;

import org.openqa.selenium.By;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Selenium extends BaseUtil {
	
	private BaseUtil base;

	public Selenium(BaseUtil base) {
		this.base = base;
	}
	
	
	@Given("I want to navigate to google")
	public void i_want_to_navigate_to_google() {
	    base.driver.get("https://www.google.com.mx/");
	}

	@When("I google a ([^\"]*)")
	public void i_google_a_text(String text) {
	     base.driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys(text);
	     base.driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
	}

	@Then("Page must still display the google logo")
	public void page_must_still_display_the_google_logo() {
	    base.driver.findElement(By.xpath("//*[@id=\"logo\"]/img"));
	}
}
