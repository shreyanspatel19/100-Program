import java.util.*;
 class P40{
  public static void main(String[] age){
    int nums[] = {1,2,15,3};
   int count = 0;
        for (int i = 1; i < nums.length && count < 2; i++) {
            if (nums[i] >= nums[i - 1]) {
                System.out.println(i+" "+nums[i] +" "+nums[i - 1] +" "+(nums[i] >= nums[i - 1]));
                continue; // non-decrease
            }
            
                System.out.println(i+" i "+nums[i] +" "+nums[i - 1] +" "+(nums[i] >= nums[i - 1]));
            if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                nums[i] = nums[i - 1]; // corner case 3 4 2 4
            } else {
                nums[i - 1] = nums[i]; // set them equal, wont affect future height 2 3 1
            }
            count++; 
        }
        System.out.println(count+" "+Arrays.toString(nums));
        return ;
  }
}