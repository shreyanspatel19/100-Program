import java.util.Scanner;
import java.lang.Math;
 class P11{
  public static void main(String[] age){
  Scanner sc = new Scanner(System.in);
  System.out.print("enter the number :- ");
  int n= sc.nextInt();
  int nn=n,count=0,sum=0,temp;

  while(n!=0){
        n=n/10;
        count++;
    }
    n=nn;
    for(int i=1;i<=count;i++){
        temp=nn%10;
       sum+=Math.pow(temp, count);
        nn=nn/10;
    }
    if(sum==n){
        System.out.println("this is Armstrong number");
    }
    else{
        System.out.println("this is not Armstrong number");
    }
    System.out.println(count);
  }
}