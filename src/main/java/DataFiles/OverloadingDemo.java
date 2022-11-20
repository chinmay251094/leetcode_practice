package DataFiles;

public class OverloadingDemo {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(5.00,5.00);

    }

    private static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        }

        double centimeters = (feet * 30.48) * 2.54;
        centimeters = centimeters + (inches * 2.54);
        return centimeters;
    }
}
