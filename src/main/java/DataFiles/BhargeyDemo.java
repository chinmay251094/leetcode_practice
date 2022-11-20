package DataFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class BhargeyDemo {
    @Test
    public void clickOption() throws InterruptedException {
        WebDriver bhargey;
        WebDriverManager.chromedriver().setup();
        bhargey = new ChromeDriver();
        bhargey.manage().window().maximize();
        bhargey.get("http://d1yn7gvyyas6eh.cloudfront.net/");

        bhargey.findElement(By.id("openLoginModel")).click();
        Thread.sleep(3000);
        bhargey.findElement(By.id("username")).sendKeys("districtAdmin");
        Thread.sleep(2000);
        bhargey.findElement(By.id("password")).sendKeys("rs123*");
        Thread.sleep(2000);
        bhargey.findElement(By.xpath("//*[@class='ng-arrow-wrapper']")).click();
        Thread.sleep(2000);
        List<WebElement> district = bhargey.findElements(By.xpath("//*[@class='ng-dropdown-panel-items scroll-host']//span"));

        for (WebElement a : district) {
            if (a.getText().equalsIgnoreCase("Rocketship Public Schools")) {
                a.click();
                break;
            }
        }

        bhargey.findElement(By.id("submitLogin")).click();

        bhargey.quit();
    }
}
