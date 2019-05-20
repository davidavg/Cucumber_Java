package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseUtil {
	
	private BaseUtil base;
	
	public Hooks(BaseUtil base) {
		System.out.println("This is the cosntructor fo Hooks");
		this.base = base;
	}
	
	@Before
	public void init() {
		System.out.println("Opening Broswer...");
		base.driver = new ChromeDriver();
		base.driver.manage().window().maximize();
	}
	
	@After
	public void end(Scenario scenario) {
		
		if(scenario.isFailed()) {
			System.out.println("scenario failed " + scenario.getName());
		}
		
		System.out.println("Closing Browser...");
		base.driver.close();
	}

}
