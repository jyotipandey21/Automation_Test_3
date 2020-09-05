package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Calender_Page.Checking_calender;
import util.Browser;

public class run_test {
	
	WebDriver driver;
	Browser browser;
	Checking_calender dropck;
	
	@Test
	public void launch() throws Exception {
		driver=Browser.launch();
		Checking_calender dropck=PageFactory.initElements(driver, Checking_calender.class);
		dropck.calender();
		
	}
	
	}