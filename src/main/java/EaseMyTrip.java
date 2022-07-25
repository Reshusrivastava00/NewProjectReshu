import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EaseMyTrip {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.easemytrip.com/");
        WebElement wb = driver.findElement(By.xpath("//input[@id ='FromSector_show']"));
        wb.click();
        wb.sendKeys("DEL");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> li = driver.findElements(By.xpath("(//div[@class='tp-cit']/ul)[1]/li"));
        int k = li.size();
        System.out.println(k);
        for (WebElement i : li) {
            System.out.println(i.getText());

        }
        driver.quit();
    }
}
