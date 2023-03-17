import java.util.*;
 class P56{
  public static void main(String[] age){
  int arr[] =  {2,5,3,9,5,3};
  int min = Integer.MAX_VALUE,mini=0;
  int sum1 = 0;
  int sum2 = 0;
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j <= i; j++){
        sum1 += arr[j];
      }
      for(int k = arr.length-1; k > i; k-- ){
        sum2 += arr[k];
      }
      sum1 = sum1 / (i+1);
      if(arr.length - i - 1 != 0){
        sum2 = sum2 / (arr.length - i - 1);
      }else{
        sum2 = 0;
      }
      sum1 = Math.abs(sum1 - sum2);
      if(min > sum1){
        min = sum1;
        mini = i;
      }
      sum1 = 0;
      sum2 = 0;
    }
    System.out.println(mini);
  }
}