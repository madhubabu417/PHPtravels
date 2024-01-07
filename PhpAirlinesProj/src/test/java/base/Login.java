package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
    @Test
	public void verifySigninWithValidCredntials()  {
		
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	
        
        driver.get("https://www.phptravels.net/");
        driver.findElement(By.xpath("(//strong[@class='m-0 text-dark'])[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Signup')]")).click();
        driver.findElement(By.id("firstname")).sendKeys("kusuma");
        driver.findElement(By.id("last_name")).sendKeys("madhu");
        driver.findElement(By.xpath("//div[@class='filter-option-inner-inner']")).click();
        driver.findElement(By.xpath("//a[@id='bs-select-1-99']//span[@class='text']")).click();
        driver.findElement(By.id("phone")).sendKeys("9999999999");
        driver.findElement(By.id("user_email")).sendKeys("kusumamadu9@gmail.com");
        driver.findElement(By.id("password")).sendKeys("kusuma");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        driver.findElement(By.cssSelector("recaptcha-checkbox-border")).click();
           
        driver.switchTo().defaultContent();

        
        driver.findElement(By.xpath("//div[@class='signup_button']")).click();     
        driver.quit();
        
        
        
	}
    
}
