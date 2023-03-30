import java.util.Scanner;
 class P72{
  public static void main(String[] age){
    int nums[] = {18,43,36,13,7,801}
        Map<Integer, Integer> map = new HashMap<>();
        int nsum;
        int ans = -1;
        for(int i : nums){
            nsum = nsum(i);
            if(!map.containsKey(nsum)){
                map.put(nsum, i);
            }else{
                ans = Math.max(ans, map.get(nsum) + i );
                map.put(nsum, Math.max(map.get(nsum), i));
            }
        }
            return ans;
  }
   public static int nsum(int n){
        int sum =0;
        while(n != 0){
        sum += n % 10;
        n = n / 10; 
        }
        return sum;
    }
}

/* 72. You are given a 0-indexed array nums consisting of positive integers. 
       You can choose two indices i and j, such that i != j, and the sum of digits of the number nums[i] is equal to that of nums[j].
       Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices i and j that satisfy the conditions.
       Input: nums = [18,43,36,13,7]
       Output: 54
       Explanation: The pairs (i, j) that satisfy the conditions are:
       - (0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54.
       - (1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50.
       So the maximum sum that we can obtain is 54.
*/