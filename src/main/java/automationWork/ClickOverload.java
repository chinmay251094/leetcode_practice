package automationWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOverload {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");
        String mobiles = "//a[@data-csa-c-content-id='nav_cs_mobiles']";
        String books = "//a[@data-csa-c-content-id='nav_cs_books']";
        String desktop = "//a[@data-csa-c-content-id='nav_cs_pc']";

        click(driver, "xpath", mobiles);
        click(driver, "xpath", books);
        click(driver, "xpath", desktop);

        WebElement fashion = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_fashion']"));
        click(fashion);

        By linkBeautyAndFashion = By.xpath("//a[@data-csa-c-content-id='nav_cs_beauty']");

        click(driver, linkBeautyAndFashion);
    }

    static void click(WebDriver driver, By by) {
        driver.findElement(by).click();
    }

    static void click(WebElement element) {
        element.click();
    }

    static void click(WebDriver driver, String locatorType, String locatorValue) {
        if (locatorType.equalsIgnoreCase("xpath")) {
            driver.findElement(By.xpath(locatorValue)).click();
        } else if (locatorType.equalsIgnoreCase("linkText")) {
            driver.findElement(By.linkText(locatorValue)).click();
        } else if (locatorType.equalsIgnoreCase("id")) {
            driver.findElement(By.id(locatorValue)).click();
        }
    }
}
