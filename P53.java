import java.util.Scanner;
 class P53{
  public static void main(String[] age){
    int x = 5;
    int y = 6;
    int count = 0, ans = x ^ y;
    while(ans > 0){

        count += ans & 1;
        ans >>= 1;
    }
    System.out.println(count);
  }
}