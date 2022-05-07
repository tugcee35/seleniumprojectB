package com.cydeo.tests.day2_locators_getTest_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_GetAttribute {

    public static void main(String[] args) {

        //1-Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2-Go to : https://practice...
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected
        WebElement headerText = driver.findElement(By.tagName("h2"));

        //Expected:Registration form
        String expectedHeaderText = "Registration form";
        String actualHeadetText = headerText.getText();

        if(actualHeadetText.equals(expectedHeaderText)){
            System.out.println("Header text verification PASSED!");
        }else{
            System.out.println("Header text verification FAILED!");
        }

        //4-Locate "First name" input box
        WebElement firstNameInput= driver.findElement(By.name("firstname"));

        //5-Verify placeholder attribute's value is as expected:
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        if(actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Placeholder text verification PASSED!");
        }else{
            System.out.println("Placeholder text verification FAILED!");
        }

        driver.close();



    }


}
