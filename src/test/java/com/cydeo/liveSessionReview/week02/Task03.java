package com.cydeo.liveSessionReview.week02;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task03 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

       driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");

        driver.findElement(By.partialLinkText("Laptops")).click();

        HandleWait.staticWait(1);
        driver.findElement(By.partialLinkText("Sony vaio i5")).click();

        int expectedPrice = 790;





    }

}
