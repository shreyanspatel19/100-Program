import java.util.*;
 class P43{
  public static void main(String[] age){
        int[] nums = {1, 5,  1};
        int k = 6;
        System.out.println(countPairs(nums, k));
  }
  public static int countPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int num : nums) {
            if (set.contains(k - num)) {
                count++;
            }
            set.add(num);
        }
        return count;
    }
}