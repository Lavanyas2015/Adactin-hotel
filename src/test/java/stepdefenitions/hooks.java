package stepdefenitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Base.BaseClass;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;



public class hooks extends BaseClass{
	
	
	
		@Before
		public void setup() {
			
		System.out.println("Start the test");
			
			
		}
		
		@After
		public void teardown(Scenario s) throws IOException {
		
			if(s.isFailed()){
				TakesScreenshot tk=(TakesScreenshot)driver;
				byte[] screen = tk.getScreenshotAs(OutputType.BYTES);
				s.embed(screen, "image/png");
			
	
			//driver.quit();
			
			
		}}}
	

