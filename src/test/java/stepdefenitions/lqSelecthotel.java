package stepdefenitions;

import com.Base.BaseClass;
import com.pom.Selecthotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class lqSelecthotel extends BaseClass {
	Selecthotel s;
	
	@Given("User is in Select hotel page")
	public void userIsInSelectHotelPage() {
		s=new Selecthotel();
		isDisplayed(s.getSelect());
	    
	}

	@When("User select the Radio button")
	public void userSelectTheRadioButton() {
	   btclick(s.getSelect());
	}

	@Then("User click on continue button")
	public void userClickOnContinueButton() {
	    btclick(s.getSub());
	}
}
