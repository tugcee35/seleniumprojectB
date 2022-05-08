package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
        //1-Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2-Go to
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3-Verify "Reset Password"

        //Locating reset password button using class attribute and its value
       // WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']"));

        //Locating reset password button using VALUE attribute and its value
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedResetPasswordButtonText = "Reset password";
        String actualResetPasswordButtonText = resetPasswordButton.getText();

        if(actualResetPasswordButtonText.equals(expectedResetPasswordButtonText)){
            System.out.println("Button text verification PASSED!");
        }else{
            System.out.println("Button text verification FAILED!");
        }




    }
}
