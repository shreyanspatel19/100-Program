import java.util.Scanner;
 class P20{
  public static void main(String[] age){
  Scanner sc = new Scanner(System.in);
  System.out.print("enter 1 number  :- ");
  int n1=sc.nextInt();
  System.out.print("enter 2 number  :- ");
  int n2=sc.nextInt();
  int sum=1,summ=0;
  for(int i=1;i<=n2;i++){
    sum=multiply(sum,n1);
  }
  System.out.println(sum);
  }
  public static int multiply(int n1,int n2){
    int sum=0;
    for(int i=1;i<=n2;i++){
    sum+=n1;
    }
    return sum;
  }
}