package com.kk.jbehave;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StudentTest {

	WebDriver webDriver;
	@BeforeScenario
	public void setup()
	{
		webDriver= new FirefoxDriver();
		
	}
	
	@Given("Open Browser with URL $url")
	public void openBrowser(final String url) throws InterruptedException{
		webDriver.get(url);
		webDriver.wait(4000000L);
	}
	
	@AfterScenario
	public void tearDown(){
		
		webDriver.close();
	}
	
}
