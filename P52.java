import java.util.Scanner;
 class P52{
  public static void main(String[] age){
  int n = 229;
  int count=2,change =0;
    while(change < n){
        change += (count++ * 2) -1;
    }
    System.out.println(count-2);
  }
  
}