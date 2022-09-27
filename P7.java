import java.util.Scanner;
 class P7{
  public static void main(String[] age){
  Scanner sc = new Scanner(System.in);
  System.out.print("enter the number :- ");
  int n= sc.nextInt(); 
  int a=0,b=1,c;
    if(n==0){
        System.out.print(a+" ");
        return ;
    }
    if(n==1){
        System.out.print(a+" ");
        System.out.print(b);
        return ;
    }
    System.out.print(a+" ");
    System.out.print(b+" ");
    for(int i=2;i<=n;i++){
        c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
    }
  }
}

class P71{
  public static void main(String[] age){
  Scanner sc = new Scanner(System.in);
  System.out.print("enter the number :- ");
  int n= sc.nextInt(); 
  int a=0,b=1,c;
    if(n==0){
        System.out.print(a+" ");
        return ;
    }
    if(n==1){
        System.out.print(a+" ");
        System.out.print(b);
        return ;
    }
    System.out.print(a+" ");
    System.out.print(b+" ");
    Fibonacci(n,a,b);
  }
  public static void Fibonacci(int n,int a,int b){
    if(n==1){
        return ;
    }
    System.out.print(a+b+" ");
    Fibonacci(n-1,b,b+a);
  }
}