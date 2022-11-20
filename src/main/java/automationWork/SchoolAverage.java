package automationWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SchoolAverage {
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
        List<WebElement> district = driver.findElements(By.xpath("//*[@class='ng-dropdown-panel-items scroll-host']//span"));

        for (WebElement a : district) {
            if (a.getText().equalsIgnoreCase("Rocketship Public Schools")) {
                a.click();
                break;
            }
        }

        driver.findElement(By.id("submitLogin")).click();
        driver.findElement(By.xpath("(//*[@href='/schools/school-list'])[1]")).click();
        List<WebElement> average = driver.findElements(By.xpath("//*[@class='datatable-row-wrapper'][1]//span"));

        for (WebElement ele : average) {
            System.out.println(ele.getText());
        }
        driver.quit();
    }
}
