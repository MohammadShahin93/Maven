package Automation_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleValidationSafari extends SafariDriverWrapper{


    @Test
    public void verifyPageTitleSafari(){
        String actualPageTitle = getDriver().getTitle();
        System.out.println("Title of the page is: " + actualPageTitle);

        String expectPageTitle = "Facebook - Log In or Sign Up";
        Assert.assertEquals(actualPageTitle,expectPageTitle,"Expected Page Title did not match Actual Page Title");
        System.out.println("Test Completed Successfully. Actual Page Title matches Expected Page Title. ");


    }



}
