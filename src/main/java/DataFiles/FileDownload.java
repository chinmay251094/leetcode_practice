package DataFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class FileDownload {
    @Test
    public void opensite() throws InterruptedException {
        WebDriver driver;
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", "G:\\SeleniumProject\\src\\main\\resources");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
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
        driver.findElement(By.id("schoolName-1")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//i[text()='save_alt']")).click();
        Thread.sleep(5000);
        File folder = new File("G:\\SeleniumProject\\src\\main\\resources");
        Assertions.assertThat(folder.length() > 0);

        for(File file : folder.listFiles()) {
            Thread.sleep(5000);
            file.delete();
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
