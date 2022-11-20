package DataFiles;

public class HarmonicSum {
    public static void main(String[] args) {
        findHarmonicSum(1, 1000);
    }

    private static void findHarmonicSum(int min, int max) {
        if (min <= 0 && max > 100) {
            System.out.println("Invalid min max values ...");
        }

        for (int i = min; i <= max; i++) {
            int sum1 = i + (i + 1);
            int sum2 = i + (i - 1);

            if (sum1 == sum2) {
                System.out.println("Harmoninc sum found at " + i);
            }
            break;
        }
    }
}
