package DataFiles;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ThreadTwo extends BaseTest {
    @Test
    public void test1() {
        Driver.driver.findElement(By.name("q")).sendKeys("Virat Kohli");
    }
}
