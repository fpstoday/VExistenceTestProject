package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
	@Given("the user is on  https:\\/\\/covercheck.vwfsinsuranceportal.co.uk\\/")
    public void open_firefox_and_start_application() throws Throwable{
	//throws InterruptedException

      System.setProperty("webdriver.gecko.driver","C://Users//Fm1//eclipse-workspace//vehicle.details.cucumber//Driver//geckodriver.exe");
				
      driver = new FirefoxDriver();
		driver.get("https://covercheck.vwfsinsuranceportal.co.uk/");	
}
	@When("the user enters valid Vehicle Registration Number: OV{int}UYY")
	public void the_user_enters_valid_Vehicle_Registration_Number_OV_UYY(Integer int1)throws Throwable {
	    driver.findElement(By.id("vehicleReg")).sendKeys("OV12UYY");
	    Thread.sleep(5000);
		}
	@When("the user clicks on {string}")
	public void the_user_clicks_on(String string)throws Throwable {
	    driver.findElement(By.id("icon")).click();
	}
	@Then("the drive away insurance details for vehicle registration: OV{int}UYY is displayed.")
	public void the_drive_away_insurance_details_for_vehicle_registration_OV_UYY_is_displayed(Integer int1)throws Throwable {
		boolean insuranceDetails = driver.findElement(By.className("track-search")).isDisplayed();	
		if(insuranceDetails == true) {
			System.out.println("Ins Details displayed - Passed ");
		}
		else {
			System.out.println("Ins Details does not display - Failed");
			Thread.sleep(5000);
		}
		}	
		@And("the user closes browser")
		public void the_user_closes_browser() throws Throwable {
			driver.close();
		}
}
