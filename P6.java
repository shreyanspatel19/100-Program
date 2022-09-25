import java.util.Scanner;
 class P6{
  public static void main(String[] age){
  Scanner sc = new Scanner(System.in);
  System.out.print("enter the number :- ");
  int n= sc.nextInt();
  for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
    System.out.print(i+" ");
    }
System.out.println();
  }
  }
}