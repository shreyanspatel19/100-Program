import java.util.*;
 class P40{
  public static void main(String[] age){
    int nums[] = {1,1,2,3};
   int count = 0;
        for (int i = 1; i < nums.length && count < 2; i++) {
            if (nums[i] >= nums[i - 1]) {
                continue; // non-decrease
            }
            
            if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                nums[i] = nums[i - 1]; // corner case 3 4 2 4
            } else {
                nums[i - 1] = nums[i]; // set them equal, wont affect future height 2 3 1
            }
            count++; 
        }
        System.out.println(count==1);
        return ;
  }
}