package automationWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestDatePicker {
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
        driver.findElement(By.id("submitLogin")).click();

        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.xpath("//*[@href='/schools/school-list']")).click();
        driver.findElements(By.xpath("//*[@class='datatable-scroll']//a[@class='h6 pmd-list-title']")).get(0).click();
        driver.findElement(By.id("studentsTabIds-link")).click();
        driver.findElement(By.id("datePickerId")).click();
        driver.findElements(By.xpath("//*[@class='dropdown-menu show']//a")).get(5).click();

        while (true) {
            if (driver.findElement(By.xpath("(//*[@class='pmd-datepicker-controls']/button[@class='current']/span)[1]")).getText().equalsIgnoreCase("August 2021")) {
                break;
            } else {
                WebElement btnPrevious = driver.findElement(By.xpath("(//*[@class='previous'])[1]"));
                btnPrevious.click();
                Thread.sleep(500);
            }
        }

        List<WebElement> listDates = driver.findElements(By.xpath("(//table[@class='days weeks'])[1]/tbody//td[1]/span[@class='ng-star-inserted']"));

        int firstSize = listDates.size();
        Random random = new Random();
        int firstDate = random.nextInt(firstSize);
        listDates.get(firstDate).click();
        driver.findElement(By.xpath("(//button[normalize-space()='Apply'])[1]")).click();
        Thread.sleep(5000);

        String dateText = driver.findElement(By.id("datePickerId")).getText();
        System.out.println("dateText:: "+dateText);
        driver.quit();
    }
}
