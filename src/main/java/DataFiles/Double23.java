package DataFiles;

public class Double23 {
    public static void main(String[] args) {
        int[] myArr = new int[] {2, 2};
    }

    public boolean double23(int[] nums) {
        if(nums.length < 0 || nums.length > 3) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if((nums[i] == 2 && nums[i+1] == 2) || (nums[i] == 3 && nums[i+1] == 3)) {
                return true;
            }
        }
        return false;
    }
}
