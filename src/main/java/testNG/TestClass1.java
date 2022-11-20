package testNG;

import org.testng.annotations.Test;

public class TestClass1 {
    @Test
    public void method1() {
        System.out.println("This is method1 >> 1 "+Thread.currentThread().getId());
    }

    @Test
    public void method2() {
        System.out.println("This is method2 >> 1 "+Thread.currentThread().getId());
    }

    @Test
    public void method3() {
        System.out.println("This is method3 >> 1 "+Thread.currentThread().getId());
    }
}
