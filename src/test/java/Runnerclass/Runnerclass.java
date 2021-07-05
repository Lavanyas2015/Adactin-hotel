package Runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.utilities.getreports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources\\Feature", glue= {"stepdefenitions"},dryRun=false,monochrome=true,strict=true,snippets=SnippetType.CAMELCASE,
plugin= {"pretty","html:src\\test\\resources\\reports",
		"json:src\\test\\resources\\reports\\output.json",
		"junit:src\\test\\resources\\reports\\ada.xml" ,
		"rerun:src\\test\\resources\\reports\\failed\\failedscenario.txt" })
                      
                        
public class Runnerclass {
	
	@AfterClass
	 public static void report() {
			
			
			getreports.getrjvmreport(System.getProperty("user.dir") + "\\src\\test\\resources\\reports\\output.json");
		     }

}
