package automationpractice.test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver = null;
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver","/Users/kseniya/Documents/QAavto/chromdriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterClass
    public static void teardown() throws InterruptedException{
        Thread.sleep(2*1000);
        if(driver != null){
            driver.quit();
        }
        else driver.close();
    }
}
