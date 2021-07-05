package stepdefenitions;

import org.junit.Assert;

import com.Base.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import com.pom.Homesceen;
import com.pom.Loginscreen;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LpHomeexecution extends BaseClass {
	Homesceen h;

	@Given("Enter the login details {string} and {string}")
	public void enter_the_login_details_and(String username, String password) throws InterruptedException {
		Loginscreen l=new Loginscreen();
		btclick(l.getLogin());
	System.out.println("Start the test for home page");
	Thread.sleep(1000);

	
}

@When("IUser is on Home screen")
public void iuser_is_on_Home_screen() {
	h=new Homesceen();
	selectByIndex(h.getLocation(), 1);
	selectByIndex(h.getHotel(), 1);
	selectByIndex(h.getRoom(), 1);
	selectByIndex(h.getRoomno(), 1);
	selectByIndex(h.getAdult_room(), 1);
	selectByIndex(h.getChild_room(), 1);
	
}

@Then("I validate the home screen dropdowns")
public void i_validate_the_home_screen_dropdowns() {
  
   btclick(h.getSubmit());
}

}
