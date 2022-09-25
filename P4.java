import java.util.Scanner;
 class P4{
  public static void main(String[] age){
   Scanner sc= new  Scanner(System.in);
    System.out.print("enter the number :- ");
    int sum=1;
    int n= sc.nextInt();
    for(int i=1;i<=n;i++){
        sum *= i;
    }
    System.out.println(sum);
  }
}

 class P41{
  public static void main(String[] age){
   Scanner sc= new  Scanner(System.in);
    System.out.println("enter the number :- ");
    int n= sc.nextInt();
    int sum=factorial(n);
    System.out.println(sum);
  }
  public static int factorial(int n){
    if(n>=1){
    return n*factorial(n-1);
    }else{
    return 1;
    }
  }
}