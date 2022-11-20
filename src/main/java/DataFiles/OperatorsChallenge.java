package DataFiles;

public class OperatorsChallenge {
    public static void main(String[] args) {
        double first = 20.00;
        double second = 80.00;
        double third = (first + second) * 100;
        double rem = third % 40.00;
        System.out.println(rem);
        boolean flag = (rem == 0) ? true : false;
        System.out.println(flag);
        if (!flag) {
            System.out.println("Got some remainder");
        }
    }
}
