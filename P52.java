import java.util.Scanner;
 class P52{
  public static void main(String[] age){
  int x = 16;

  if(x <= 1) return x;

    int start = 1;
    int end = x;       

    while(start < end) {
      int mid = (start + (end-start)/2) + 1;
      int div = x/mid;
      if(div == mid) return mid;
      if(div > mid) start = mid;
      else end = mid-1;
    }
    System.out.println(start);
  }
}