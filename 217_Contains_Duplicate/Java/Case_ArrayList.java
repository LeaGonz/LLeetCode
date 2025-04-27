import java.util.ArrayList;

/*Time Limit Exceeded */

public class Case_ArrayList {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(isDuplicate(nums));
    }

    private static boolean isDuplicate(int[] nums) {
        ArrayList<Integer> check = new ArrayList<>();

        for (int num : nums) {
            if (check.contains(num))
                return true;
            else
                check.add(num);
        }
        return false;
    }

}
