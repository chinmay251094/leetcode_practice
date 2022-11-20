package automationWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestDateDropdown {
    @Test
    public void opensite() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://d1yn7gvyyas6eh.cloudfront.net/");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.id("openLoginModel")).click();
        driver.findElement(By.id("username")).sendKeys("districtAdmin");
        driver.findElement(By.id("password")).sendKeys("rs123*");
        driver.findElement(By.xpath("//*[@class='ng-arrow-wrapper']")).click();
        List<WebElement> ele = driver.findElements(By.xpath("//*[@class='ng-dropdown-panel-items scroll-host']//span"));
            try {
                for (int i = 0; i < ele.size(); i++) {
                    String option = ele.get(i).getText();
                    if (option.contains("Rocketship Public Schools")) {
                        ele.get(i).click();
                        Thread.sleep(1000);
                        break;
                    }
                }
            } catch (Exception ex) {
                ex.getStackTrace();
            }
        driver.findElement(By.id("submitLogin")).click();

        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.xpath("//*[@href='/schools/school-list']")).click();
        driver.findElements(By.xpath("//*[@class='datatable-scroll']//a[@class='h6 pmd-list-title']")).get(0).click();
        driver.findElement(By.id("teachersTabIds-link")).click();
        driver.findElement(By.id("datePickerId")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
