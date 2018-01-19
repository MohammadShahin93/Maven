package Automation_Practice;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TItleValidationChrome extends ChromeDriverWrapper {




        @Test
        public void verifyUrlChrome(){

            // Gets the URL of the given page
            String actualFbUrl = getDriver().getCurrentUrl();
            System.out.println("The url you are navigating to is " + getDriver().getCurrentUrl());

            //verifies if the Actual URL matches Expected URL
            Assert.assertEquals(actualFbUrl,"https://www.facebook.com/", "Url did not match");
            System.out.println("Test Completed Successfully. Actual URL matches Expected URL. ");
        }

        @AfterMethod
        public void verifyPageTitleChrome(){
            String actualPageTitle = getDriver().getTitle();
            System.out.println("Title of the page is: " + actualPageTitle);

            String expectedPageTitle = "Facebook - Log In or Sign Up";
            Assert.assertEquals(actualPageTitle,expectedPageTitle,"Expected Page Title did not match Actual Page Title");
            System.out.println("Test Completed Successfully. Actual Page Title matches Expected Page Title. ");


        }



    }



