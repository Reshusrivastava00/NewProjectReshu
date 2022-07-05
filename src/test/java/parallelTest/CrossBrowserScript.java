package parallelTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserScript {
    WebDriver driver;


    @BeforeTest
    @Parameters("browser")
    public void run(String browser) throws Exception {
        if (browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {throw new Exception("Browser is not correct");}

    }


    @Test
    public void navigate_to_Amazon() {
        driver.get("https://www.amazon.com");
    }

    @AfterTest
    public void quitdriver(){
        driver.quit();
    }

}





