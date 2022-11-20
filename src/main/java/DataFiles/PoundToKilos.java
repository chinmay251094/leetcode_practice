package DataFiles;

public class PoundToKilos {
    public static void main(String[] args) {
        System.out.println(convertToKilos(320));
    }

    private static double convertToKilos(int i) {
        final double pound = 0.45359237;
        double kilos = i * pound;
        return kilos;
    }
}
