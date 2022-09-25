import java.util.Scanner;
 class P5{
  public static void main(String[] age){
    Scanner sc= new  Scanner(System.in);
    System.out.print("enter the number :- ");
    int sum=0,temp;
    int n= sc.nextInt();
    while(n!=0){
        temp=n%10;
        sum=temp+sum;
        n=n/10;
    }
    System.out.println(sum);
  }
}
 class P51{
  public static void main(String[] age){
    Scanner sc= new  Scanner(System.in);
    System.out.println("enter the number :- ");
    int n= sc.nextInt();
    int sum = sum(n);
    System.out.println(sum);
  }
  public static int sum(int n){
    if(n == 0){
        return 0;
        }
    return ((n % 10) + sum(n / 10));
  }
}