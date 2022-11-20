package leetCode;

public class ClimbingStairs {
    //Overriding comment
    //This is a test comment again
    //ClimbingStairs
    public static void main(String[] args) {
        System.out.println("Calling functions");
        System.out.println(climbStairs(6));
    }

    private static int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
