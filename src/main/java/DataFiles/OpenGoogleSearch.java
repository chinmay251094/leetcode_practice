package DataFiles;

import com.google.common.util.concurrent.Uninterruptibles;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class OpenGoogleSearch {
    @Test
    public void open() {
        WebDriver driver = null;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);

        driver.quit();
    }
}
