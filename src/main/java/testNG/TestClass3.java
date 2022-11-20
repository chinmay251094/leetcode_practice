package testNG;

import org.testng.annotations.Test;

public class TestClass3 {
    @Test
    public void method6() {
        System.out.println("This is method6 >> 3 "+Thread.currentThread().getId());
    }

    @Test
    public void method7() {
        System.out.println("This is method7 >> 3 "+Thread.currentThread().getId());
    }

    @Test
    public void method8() {
        System.out.println("This is method8 >> 3 "+Thread.currentThread().getId());
    }

    @Test
    public void method9() {
        System.out.println("This is method9 >> 3 "+Thread.currentThread().getId());
    }
}
