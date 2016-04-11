package test;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vilson on 11/04/16.
 */
public class Teste {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
    }

    @Given("^I am on Google home page$")
    public void i_am_on_Google_home_page() throws Throwable {
        driver.get("http://google.com");
    }


}
