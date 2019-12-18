package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"MyFeatures"},glue= {"C:\\Users\\n.ajit.ichalkaranje\\Documents\\selenium-monday\\src\\test\\java\\TestDefination"})//(folder name,package name,tag name)
public class Runner1 {

}
