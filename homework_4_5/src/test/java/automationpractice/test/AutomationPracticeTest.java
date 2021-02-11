package automationpractice.test;

import org.junit.Test;
import org.openqa.selenium.By;

public class AutomationPracticeTest extends BaseTest{
    @Test
    public void testCanCheckIn(){
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.xpath("//div[@class='form-group']//input[@id='email_create']")).
                sendKeys("ksyuw@yahoo.com");
        driver.findElement(By.
                xpath("//div[@class='submit']//button[@class='btn btn-default button button-medium exclusive']")).click();
        driver.findElement(By.xpath("//div[@class='radio-inline']//label[@for='id_gender2']")).click();
        driver.findElement(By.xpath("//div[@class='required form-group']//input[@id='customer_firstname']")).
                sendKeys("Kseniya");
        driver.findElement(By.xpath("//div[@class='required form-group']//input[@id='customer_lastname']")).
                sendKeys("Yermilova");
        driver.findElement(By.id("passwd")).sendKeys("123qaz");
        driver.findElement(By.xpath("//p[@class='form-group']//input[@id='company']")).
                sendKeys("ProgKiev");
        driver.findElement(By.xpath("//p[@class='required form-group']//input[@id='address1']")).
                sendKeys("str.Shevchenko, ProgKiev");
        driver.findElement(By.xpath("//p[@class='form-group is_customer_param']//input[@id='address2']")).
                sendKeys("5,3,567");
        driver.findElement(By.xpath("//p[@class='required form-group']//input[@id='city']")).
                sendKeys("Kiev");
        driver.findElement(By.xpath("//p[@class='required form-group']//input[@id='phone_mobile']")).
                sendKeys("0502980477");
        driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
        String text = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
        if (text != null) System.out.println(text);

    }
}
