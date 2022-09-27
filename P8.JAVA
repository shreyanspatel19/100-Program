import java.util.Scanner;
 class P8{
  public static void main(String[] age){
  Scanner sc = new Scanner(System.in);
  System.out.print("enter the number :- ");
  int n= sc.nextInt(); 
  int odd=0,even=0,temp;
  for(;n!=0;){
    temp=n%10;
    if(temp%2==0){
        even++;
    }
    else{
        odd++;
    }
    n/=10;
  }
  System.out.println("total odd  number is :- "+odd+"\ntotal even number is :- "+even);
  }
}