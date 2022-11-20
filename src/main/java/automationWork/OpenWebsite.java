package automationWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class OpenWebsite {
    @Test
    public void opensite() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://login.readingplus.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement btnEducator = driver.findElement(By.xpath("//*[@href='/educator/']"));
        btnEducator.click();

        driver.findElement(By.id("username-input")).sendKeys("sgandhi@rsed.org");
        driver.findElement(By.id("password-input")).sendKeys("romero21");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.xpath("//button[text()='Dismiss']")).click();
        driver.findElement(By.name("progress")).click();
        driver.findElement(By.xpath("//emerson-report-action-menu")).click();
        driver.findElement(By.xpath("//paper-button[contains(text(),'Export Student Data')]")).click();
        driver.findElement(By.xpath("//div[text()='Please wait. Your CSV is being generated and will download when completed.']")).click();
        Thread.sleep(3000);
        WebElement menu = driver.findElement(By.xpath("(//*[@id='menu'])[2]"));
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
        driver.findElement(By.xpath("//paper-item[contains(.,'Log Out')]")).click();

        driver.quit();
    }
}
