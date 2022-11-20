package automationWork;

import com.google.common.util.concurrent.Uninterruptibles;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dropdowns {
    @Test
    public void testDropdown() {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        driver.findElement(By.id("course")).click();
        List<WebElement> list = driver.findElements(By.xpath("//select[@id='course']/option"));
        System.out.println("Size:: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i).getAttribute("innerText");
            if (ele.equalsIgnoreCase("Python")) {
                list.get(i).click();
                break;
            }
        }

        driver.findElement(By.xpath("//html")).click();

        for (WebElement ele : list) {
            if(ele.getAttribute("innerText").equalsIgnoreCase("Python")) {
                ele.click();
                break;
            }
        }

        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        driver.quit();
    }
}
