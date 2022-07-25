import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinks {

    static int code = 0;

    public static void main(String[] args) throws IOException {
        String HomePage = "https://www.healthkart.com/";
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(HomePage);
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement ele : links) {
            String Url = ele.getAttribute("href");

            if (Url == null) {

                System.out.println("fARZI LINKS");
            } else if (!Url.startsWith("https://www.healthkart.com/")) {
                System.out.println("Farzi link ");
            } else {
                URL url = new URL(Url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("HEAD");
                httpURLConnection.connect();
                code = httpURLConnection.getResponseCode();
                 if (code >= 400) {
                    System.out.println(Url+"is a broken link ");
                }else  {
                    System.out.println(Url +"is a perfect link");
                }

            }
        }

    }
}
