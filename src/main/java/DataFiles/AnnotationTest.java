package DataFiles;

import org.testng.annotations.*;

public class AnnotationTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("In BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("In AfterSuite");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("In BeforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("In AfterMethod");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("In BeforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("In AfterTest");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }
}
