package DataFiles;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        double sum = 0;
        double avg = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        avg = sum / 100;
        System.out.println("Sum is:: " + sum);
        System.out.println("Avg is:: " + avg);
    }
}
