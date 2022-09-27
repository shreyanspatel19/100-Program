import java.util.Scanner;
 class P9{
  public static void main(String[] age){
  Scanner sc = new Scanner(System.in);
  System.out.print("enter the number :- ");
  int n= sc.nextInt(); 
    if(((n/2)*2)==n){
        System.out.println("even ");
    }
    else{
        System.out.println("odd ");
    }
  }
}