package DataFiles;

import org.testng.annotations.Test;

public class MultipleTry {
    @Test
    public void multipleTries() {
        try {
            System.out.println("Hey");
        } catch (ArithmeticException ex) {
            ex.getMessage();
        } catch (NoClassDefFoundError ex) {
            ex.getMessage();
        } catch (Exception ex) {
            throw new RuntimeException("Testing...");
        } finally {
            System.out.println("Will execute no matter what");
        }
    }
}
