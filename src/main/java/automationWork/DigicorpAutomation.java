package automationWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DigicorpAutomation {
    //@Test
    public void openDigicorp() throws InterruptedException {
        /*
            Initiates driver
         */
        WebDriver driver;
        /*
            Invokes browser, opens the website and maximizes
         */
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         /*
            Defining conditions which would consider test case as passed
         */
        String expectedURL = "https://www.digi-corp.com/";
         /*
            Automates manual tasks
         */
        driver.findElement(By.name("q")).sendKeys("Digicorp", Keys.ENTER);
        List<WebElement> searchResult = driver.findElements(By.xpath("//*[@id='search']//h3"));
        searchResult.get(0).click();
        String actualURL = driver.getCurrentUrl();
         /*
            Asserts/Tests/Validates the output
         */
        Assertions.assertThat(expectedURL).isEqualTo(actualURL);
         /*
            Closes the browser
         */
        driver.quit();
    }

    @Test(dataProvider = "setData")
    public void testData(String username, String password) {
        System.out.println("Entering username");
    }

    @DataProvider
    public Object[][] setData() {
        return new Object[][]{
                {"Komal", "Bhagat"},
                {"Chinmay", "Bhagat"},
                {"Dheku", "Beta"},
                {"Gatlo", "cat"}
        };
    }
}
