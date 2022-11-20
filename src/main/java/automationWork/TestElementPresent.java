package automationWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestElementPresent {
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

        for(WebElement a : district) {
            if(a.getText().equalsIgnoreCase("Rocketship Public Schools")) {
                a.click();
                break;
            }
        }

        driver.findElement(By.id("submitLogin")).click();



        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.xpath("//*[@href='/schools/school-list']")).click();
        driver.findElements(By.xpath("//*[@class='datatable-scroll']//a[@class='h6 pmd-list-title']")).get(0).click();
        WebElement studentTab = driver.findElement(By.id("studentsTabIds-link"));
        studentTab.click();

        String tabAttribute = studentTab.getAttribute("class");
        Assertions.assertThat(tabAttribute).isEqualToIgnoringWhitespace("nav-link active");

        int tabTeacher = driver.findElements(By.id("teachersTabIds-link")).size();

        Assertions.assertThat(tabTeacher).isLessThan(0);
//        Assertions.assertThat(tabTeacher).isGreaterThan(0);
//        driver.findElements(By.id("teachersTabIds-link"));
//        driver.findElements(By.id("studentsTabIds-link"));
//        driver.findElements(By.id("gradesTabIds-link"));
    }
}
