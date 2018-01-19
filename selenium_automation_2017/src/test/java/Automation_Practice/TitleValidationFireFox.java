package Automation_Practice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TitleValidationFireFox extends FireFoxDriverWrapper{




    @Test
    public void verifyPageTitleFireFoxTitle(){
        String actualPageTitle = getDriver().getTitle();
        System.out.println("Title of the page is: " + actualPageTitle);

        String expectedPageTitle = "Facebook - Log In or Sign Up";
        Assert.assertEquals(actualPageTitle,expectedPageTitle,"Expected Page Title did not match Actual Page Title");
        System.out.println("Test Completed Successfully. Actual Page Title matches Expected Page Title. ");


    }



}
