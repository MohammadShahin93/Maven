package Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FireFoxDriverWrapper {
    //Initializing variable driver
    private static WebDriver driver = null;
    /// Assign facebook.com to variable "url"
    private String url = "https://www.facebook.com/";
    // Setting expected Facebook page title
    private String expectedTitle = "Facebook - Log In or Sign Up";

    //Gets the driver
    public static WebDriver getDriver() {
        return driver;
    }
    //Gets expected title
    public String getExpectedTitle() {
        return expectedTitle;
    }
    public String getUrl() {
        return url;
    }



    @BeforeClass
    //gets FireFox driver and navigates to the given url
    public void initializeWebDriver() {
        System.setProperty("gecko.driver","/usr/local/Cellar/geckodriver/0.19.1");
        driver = new FirefoxDriver();
        driver.navigate().to(url);


    }

    @AfterClass
    //Quits Browser
    public void quitWebDriver() {
        driver.quit();

    }

}