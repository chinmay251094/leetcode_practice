package testNG;

import org.testng.annotations.Test;

public class TestClass2 {
    @Test
    public void method3() {
        System.out.println("This is method3 >> 2 "+Thread.currentThread().getId());
    }

    @Test
    public void method4() {
        System.out.println("This is method4 >> 2 "+Thread.currentThread().getId());
    }

    @Test
    public void method5() {
        System.out.println("This is method5 >> 2 "+Thread.currentThread().getId());
    }
}
