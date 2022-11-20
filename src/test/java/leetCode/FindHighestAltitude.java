package leetCode;

public class FindHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {52, -91, 72};
        System.out.println(largestAltitude(gain));
    }

    private static int largestAltitude(int[] gain) {
        int[] netGain = new int[gain.length + 1];
        netGain[0] = 0;
        netGain[1] = gain[0];


        for (int i = 2; i < netGain.length; i++) {
            netGain[i] = netGain[i - 1] + gain[i - 1];
        }

        int max = netGain[0];
        for (int i = 0; i < netGain.length - 1; i++) {
            if (max < netGain[i + 1]) {
                max = netGain[i + 1];
            }
        }
        if (max < 0) {
            max = 0;
        }
        return max;
    }
}
