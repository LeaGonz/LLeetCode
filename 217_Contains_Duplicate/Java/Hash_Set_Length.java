
import java.util.Arrays;

public class Hash_Set_Length {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(isDuplicate(nums));
    }

    private static boolean isDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
