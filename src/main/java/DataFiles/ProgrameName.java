package DataFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProgrameName {
    @Test
    public void clickOption() throws InterruptedException {
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

        Thread.sleep(1000);

        List<WebElement> clickMenu = driver.findElements(By.xpath("//*[@class='nav flex-column pmd-sidebar-nav']/li"));
        clickMenu.get(1).click();

        List<WebElement> schoolList = driver.findElements(By.xpath("//*[@class='datatable-body']//a[@class='h6 pmd-list-title']"));
        schoolList.get(0).click();

        List<WebElement> tabs = driver.findElements(By.xpath("//*[@class='nav nav-tabs']/li/a/span"));
        tabs.get(3).click();

        driver.findElement(By.xpath("//*[@class='pmd-checkbox custom-control-label' and text()=' Program name']")).click();

        List<WebElement> dropdownOptions = driver.findElements(By.xpath("//*[@class='ng-dropdown-panel-items scroll-host']//p"));

//        for (WebElement A : dropdownOptions)
//        {
//            String B = A.getText();
//            System.out.println("This is output" +B);
//        }
//        System.out.println("After for");

        clickDropdownOption(dropdownOptions, "Lexia");
        Thread.sleep(3000);

        List<WebElement> btnClear = driver.findElements(By.xpath("//*[@class='btn pmd-btn-link pmd-btn btn-dark pmd-btn-flat' and text()='Clear']"));

        Assertions.assertThat(btnClear).isNotEmpty();
        driver.quit();
    }

    public static void clickDropdownOption(List<WebElement> ele, String value) {
        try {
            for (int i = 0; i < ele.size(); i++) {
                String option = ele.get(i).getText();
                if (option.contains(value)) {
                    ele.get(i).click();
                    Thread.sleep(1000);
                    break;
                }
            }
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}
