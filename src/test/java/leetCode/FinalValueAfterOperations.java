package leetCode;

public class FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] s = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(s));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int count = 0;
        if (!(operations.length < 0)) {
            for (int i = 0; i < operations.length; i++) {
                if (operations[i].equals("X++") || operations[i].equals("++X")) {
                    count++;
                } else if (operations[i].equals("X--") || operations[i].equals("--X")) {
                    count--;
                }
            }
        }
        return count;
    }
}
