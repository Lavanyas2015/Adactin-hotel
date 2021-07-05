package stepdefenitions;



import org.junit.Assert;

import com.Base.BaseClass;
import com.pom.Loginscreen;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Loginexecution extends BaseClass {
	 Loginscreen l;
	 Loginscreen l1;
	
	@Given("User is in adactin login screen")
	public void user_is_in_adactin_login_screen() {

		launchBrowser("chrome");
			locatorwait(20);
			 
		launchUrl("http://adactinhotelapp.com/");
	}

	@When("Enter the username {string} and password {string}")
	public void enter_the_username_and_password(String username, String password) {
		l=new  Loginscreen();
		fillTextbox(l.getUsername(), username);
		fillTextbox(l.getPassword(), password);
		
	}
	
	@When("User click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		
		Thread.sleep(2000);
	}

	@Then("Verify user name and password")
	public void verify_user_name_and_password() {
	    System.out.println("User is in home page now");
	}}



