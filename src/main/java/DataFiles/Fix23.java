package DataFiles;

public class Fix23 {
    public static void main(String[] args) {
        int[] myArr = new int[]{2, 2, 3};
        Fix23 obj = new Fix23();

        for (int i = 0; i < obj.fix23(myArr).length; i++) {
            System.out.println(myArr[i]);
        }
    }

    public int[] fix23(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
                break;
            }
        }
        return nums;
    }
}
