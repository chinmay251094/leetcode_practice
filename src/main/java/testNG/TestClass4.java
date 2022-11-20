package testNG;

import org.testng.annotations.Test;

public class TestClass4 {
    @Test
    public void method10() {
        System.out.println("This is method6 >> 4 "+Thread.currentThread().getId());
    }

    @Test
    public void method11() {
        System.out.println("This is method7 >> 4 "+Thread.currentThread().getId());
    }

    @Test
    public void method12() {
        System.out.println("This is method8 >> 4 "+Thread.currentThread().getId());
    }

    @Test
    public void method13() {
        System.out.println("This is method9 >> 4 "+Thread.currentThread().getId());
    }
}
