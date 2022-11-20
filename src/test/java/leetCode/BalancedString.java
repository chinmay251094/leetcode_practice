package leetCode;

public class BalancedString {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRLRRRLLLRLRL"));
    }

    public static int balancedStringSplit(String s) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                sum = sum - 1;
            } else {
                sum = sum + 1;
            }
            if (sum == 0) {
                count++;
            }
        }
        return count;
    }
}
