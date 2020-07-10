package com.chris.bstestsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
    	driver.navigate().to("https://www.booking.com/");
        WebElement element = driver.findElement(By.name("ss"));
        element.sendKeys("Dublin");
        element.submit();
        Thread.sleep(5000);
        
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Booking.com: Hotels in Dublin. Book your hotel now!";
        Boolean isTitleChanged = driver.getTitle().equalsIgnoreCase("Booking");
        Boolean isTitlePresent = driver.getTitle().equalsIgnoreCase("Booking.com: Hotels in Dublin. Book your hotel now!");

        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Assert.assertFalse(isTitleChanged);
        Assert.assertTrue(isTitlePresent);
    }
    
 /*   @Test
    public void testExtranet() throws Exception {
    	driver.navigate().to("https://www.booking.com/");
	    driver.findElement(By.className("extranet_link")).click();
		Thread.sleep(5000);
		
		Boolean isTitlePresent = driver.getTitle().equalsIgnoreCase("Booking.com Account");
		
		Assert.assertTrue(isTitlePresent);
    }*/
}