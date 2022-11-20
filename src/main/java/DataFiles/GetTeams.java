package DataFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class GetTeams {
    @Test
    public void getTeamNames() {
        WebDriver driver = null;
        int count = 1;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/2022%E2%80%9323_Premier_League");

        List<WebElement> teams = driver.findElements(By.xpath("//table[@class='wikitable'][2]/tbody/tr/th/a"));

        for (WebElement ele : teams) {
            System.out.print(count + ". ");
            count++;
            System.out.println(ele.getAttribute("innerText"));
        }

        driver.quit();
    }
}
