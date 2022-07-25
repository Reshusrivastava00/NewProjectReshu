package parallelTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Wait_Statements {
    WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void wait(String browser) throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test
    public void run_Amazon() {
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
       // driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']"));
       // System.out.println("Hi My name is reshua");
        WebDriverWait wait = new WebDriverWait(driver,30);

    }
    //@AfterTest
   // public void quitdriver(){
   // driver.quit();
}


