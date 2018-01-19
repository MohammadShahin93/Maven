package Automation_Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class ChromeDriverWrapper {

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
    //Gets expected URL
    public String getUrl() {
        return url;
    }



        @BeforeClass
        //gets chrome driver and navigates to the given url
        public void initializeWebDriver() {
            System.setProperty("webdriver.chrome.driver","/Users/mohammad/Downloads/chromedriver");
            driver = new ChromeDriver();
            driver.navigate().to(url);


        }

        @AfterClass
        //Quits Browser
        public void quitWebDriver() {
            driver.quit();

        }

    }

