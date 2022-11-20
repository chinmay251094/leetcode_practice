package DataFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class ChildParentTechSoup {
    WebDriver driver;

    @Test
    public void opensite() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://d37dzjv5lmxou4.cloudfront.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@type='button' and text()='Log In']")).click();
        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("mydummyorg+dev+m1+a01@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Test@1234");
        driver.findElement(By.xpath("//*[@type='submit' and text()='LOG IN']")).click();
        List<WebElement> teamMembersList = driver.findElements(By.xpath("(//*[@id='table-propeller'])[5]//a"));

//        List<WebElement> btnSuspendDeleteAccount = driver.findElements(By.xpath("//*[normalize-space()='Suspend or Delete User Account']"));
//
//        List<WebElement> myList = teamMembersList;
//        if (myList.size() <= 0) {
//            throw new Exception("Empty list");
//        }
//        boolean flag = false;
//        for (WebElement element : myList) {
//            element.click();
//            Thread.sleep(3000);
//            if (btnSuspendDeleteAccount.size() > 0) {
//                driver.findElement(By.xpath("//*[normalize-space()='Suspend or Delete User Account']")).click();
//                driver.findElement(By.xpath("//*[normalize-space()='CONTINUE WITH SUSPENSION']")).click();
//                WebElement parent = getParentNode(element);
//                try {
//                    WebElement child = getChildNode(parent);
//                    System.out.println("Child node text:: " + child.getText());
//                    flag = true;
//                } catch (NoSuchElementException ex) {
//                    flag = false;
//                    ex.printStackTrace();
//                }
//                break;
//            } else {
//                driver.findElement(By.xpath("//*[@class='pmd-svg-icon md-dark pmd-icon-sm ml-auto']")).click();
//                Thread.sleep(3000);
//            }
//        }
//        driver.quit();
//    }
//
//    public WebElement getParentNode(WebElement nodeParent) {
//        WebElement parent = (WebElement) ((JavascriptExecutor) driver).executeScript(
//                "return arguments[0].parentNode;", nodeParent);
//        return parent;
//    }
//
//    public WebElement getChildNode(WebElement nodeChild) {
//        WebElement input = nodeChild.findElement(By.xpath("//*[normalize-space()='SUSPENDED']"));
//        return input;
//    }
    }
}
