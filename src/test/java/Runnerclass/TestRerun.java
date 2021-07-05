package Runnerclass;

import org.junit.runner.RunWith;

import com.utilities.getreports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources\\reports\\failed\\failedscenario.txt", glue= {"stepdefenitions"},
                    dryRun=false,monochrome=true,strict=true,snippets=SnippetType.CAMELCASE)
public class TestRerun {
    
}
