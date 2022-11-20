package DataFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasicGoogle {
    WebDriver driver;

    @Test
    public void opensite() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://d37dzjv5lmxou4.cloudfront.net/\n");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@type='button' and text()='Log In']")).click();
        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("mydummyorg+dev+m1+a01@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Test@1234");
        driver.findElement(By.xpath("//*[@type='submit' and text()='LOG IN']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Recommendations']")).click();
        List<WebElement> options =
                driver.findElements(By.xpath("//following::div[@class='dropdown-menu collapse dropdown-menu-right recommendations-menu show']/a"));
        System.out.println("options size:: "+options.size());
        for(WebElement element : options) {
            System.out.println("Element:: "+element.getText());
            if(element.getText().equalsIgnoreCase("Overall Recommendations")) {
                element.click();
                Thread.sleep(2000);
                break;
            }
        }

        String expectedURL = driver.getCurrentUrl();
        String actualURL = "https://d37dzjv5lmxou4.cloudfront.net/recommendations/overall";
        Assertions.assertThat(actualURL).isEqualTo(expectedURL);
        driver.quit();
    }
}
