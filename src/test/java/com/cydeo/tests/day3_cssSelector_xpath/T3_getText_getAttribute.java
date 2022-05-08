package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getText_getAttribute {


    public static void main(String[] args) {
        //1-Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2-Go to
        driver.get("https://login1.nextbasecrm.com/");

        //3-Verify "remember me"
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();
        if(actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label verification PASSED!");
        }else{
            System.out.println("Label verification FAILED!");
        }

        //4- Verify "forgot password"
        WebElement forgotPasswordLink = (WebElement) driver.findElements(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordLinkText = "Forgot your password";
        String actualForgotPasswordLinkText = forgotPasswordLink.getText();

        if(actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)){
            System.out.println("Forgot password link verification PASSED!");
        }else{
            System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
            System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);
            System.out.println("Forgot password link verification FAILED!");
        }

        //5- Verify "forgot password" href attribute's value contains expected.
        String expectedInHerf = "forgot_password=yes";
        String actualHerfAttributeValue = forgotPasswordLink.getAttribute("href");

        System.out.println("actualHerfAttributeValue = " + actualHerfAttributeValue);

        if(actualHerfAttributeValue.contains(expectedInHerf)){
            System.out.println("HREF attribute value verification PASSED!");
        }else{
            System.out.println("HREF attribute value verification FAILED!");
        }

    }
}
