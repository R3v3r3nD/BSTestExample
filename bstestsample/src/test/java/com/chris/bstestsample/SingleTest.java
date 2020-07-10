package com.chris.bstestsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
        driver.get("https://www.booking.com/");
        WebElement element = driver.findElement(By.name("ss"));
        element.sendKeys("Dublin");
        element.submit();
        Thread.sleep(5000);

        Assert.assertEquals("Booking.com: Hotels in Dublin. Book your hotel now!", driver.getTitle());
    }
}