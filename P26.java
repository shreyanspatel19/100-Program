import java.util.Scanner;
 class P26{
  public static void main(String[] age){
  Scanner sc = new Scanner(System.in);
  System.out.print("enter number Binary  :- ");
    int n=sc.nextInt();
    int temp,sum=0;
    for(int i=0;n!=0;i++){
        temp=n%10;
        if(temp==1){
        sum=(int)Math.pow(2,i)+sum;
        }

        n=n/10;
    }
    System.out.println("Binary to Decimal = "+sum);
  }
}