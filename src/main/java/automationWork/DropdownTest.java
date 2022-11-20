package automationWork;

import com.google.common.util.concurrent.Uninterruptibles;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownTest {
    @Test
    public void testDropdown() {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        driver.findElement(By.id("course")).click();
        List<WebElement> list = driver.findElements(By.xpath("//select[@id='course']/option"));

        for (WebElement item : list) {
            if (item.getAttribute("innerText").equalsIgnoreCase("Java")) {
                System.out.println(item.getText());
                item.click();
                driver.findElement(By.xpath("//html")).click();
                Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
                break;
            }
        }
        driver.quit();
    }
}
