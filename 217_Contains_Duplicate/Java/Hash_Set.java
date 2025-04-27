
import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };

        System.out.println(duplicate(nums));
    }

    public static boolean duplicate(int[] nums) {
        Set<Integer> check = new HashSet<>();

        for (int num : nums) {
            if (check.contains(num))
                return true;
            else
                check.add(num);
        }
        return false;
    }
}
