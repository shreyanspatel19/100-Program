import java.util.Scanner;
 class P10{
  public static void main(String[] age){
  Scanner sc = new Scanner(System.in);
  System.out.print("enter the number first :- ");
  int n1= sc.nextInt();
  System.out.print("enter the number second :- ");
  int n2= sc.nextInt(); 
  for(int i=n1;i<=n2;i++){
    for(int j=2;j<i;j++){
        if(i%j==0){
            System.out.println(i);
            break;
        }
    }
  } 
  }
}