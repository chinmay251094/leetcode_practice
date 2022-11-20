package DataFiles;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ThreadOne extends BaseTest {
    @Test
    public void test1() {
        Driver.driver.findElement(By.name("q")).sendKeys("Cricket 22");
    }

    @Test
    public void test2() {
        Driver.driver.findElement(By.name("q")).sendKeys("Liam Livingstone");
    }
}
