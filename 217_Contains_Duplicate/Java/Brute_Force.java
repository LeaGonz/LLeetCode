/* Time Limit Exceeded */

public class Brute_Force {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(duplicate(nums));
    }

    public static boolean duplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}