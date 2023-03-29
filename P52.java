import java.util.Scanner;
 class P52{
  public static void main(String[] age){
  int n = 170;
  int count=2,change =0;
    while(change < n){
      System.out.print(change+" ");
      System.out.println(count*2 -1);
        change += (count++ * 2) -1;
    }
    System.out.println(count-2);
  }
  
}