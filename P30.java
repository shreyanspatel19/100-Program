import java.util.Scanner;
 class P30{
  public static void main(String[] age){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number :- ");
    int n=sc.nextInt();
    binary(n);
  }
  public static void binary(int n){
    int temp,i=0,ans=0;
    for(;n!=0;){
        temp=n%2;
        ans=ans*10+temp;
        if(ans==0){
            i++;
        }
        n=n/2;
    }
    System.out.println(ans*(int)Math.pow(10,i)+" "+i);
  }
}