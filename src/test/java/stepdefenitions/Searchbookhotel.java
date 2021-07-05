package stepdefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.BaseClass;
import com.pom.bookhotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchbookhotel extends BaseClass{
	bookhotel b;
	@Given("User is in book hotel screen")
	public void userIsInBookHotelScreen() {
	  System.out.println("User is in book hotel page");
	}

	@When("User select the details and click on book now button")
	public void userSelectTheDetailsAndClickOnBookNowButton() {
		b=new bookhotel();
		
	   fillTextbox(b.getFirst_name(),"Lavanyas");
	   fillTextbox(b.getLast_name(), "S");
	   fillTextbox(b.getAddress(), "test");
	   fillTextbox(b.getCc_num(), "1234567890123456");
	   selectByIndex(b.getCc_type(), 1);
	   selectByIndex(b.getCc_exp_month(), 1);
	   selectByValue(b.getCc_exp_year(), "2022");
	   fillTextbox(b.getCc_cvv(), "1234");
	}

	@Then("Verify the booking number generated or not")
	public void verifyTheBookingNumberGeneratedOrNot() {
	    btclick(b.getBook_now());

		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//input[@id='order_no']"))));
		
		System.out.println(getAttributevalue(b.getOrder_no()));
		
	}
}
