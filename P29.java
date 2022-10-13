import java.util.Scanner;
 class P29{
  public static void main(String[] age){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number First   :- ");
    int A=sc.nextInt();
    System.out.print("enter number Seccond  :- ");
    int B=sc.nextInt();
    int a,b,i;
    if(A>B){
        a=A;
        b=B;
    }else{
        a=B;
        b=A;
    }
    for( i=0;a>=b;i++){
        a=a-b;
    }
    System.out.println("quotient = "+i);
    System.out.println("reminder = "+a);
  }
}