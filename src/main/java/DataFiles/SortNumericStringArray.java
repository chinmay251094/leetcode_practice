package DataFiles;

public class SortNumericStringArray {
    public static void main(String[] args) {
        int[] myArr = new int[]{6, 5, 7, 3};
        for (int i = 0; i < new SortNumericStringArray().sortArrayInt(myArr).length; i++) {
            System.out.println(new SortNumericStringArray().sortArrayInt(myArr)[i]);
        }
    }

    public int[] sortArrayInt(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
