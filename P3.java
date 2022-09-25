import java.util.Scanner;
 class P3{
  public static void main(String[] age){
    Scanner sc= new  Scanner(System.in);
    System.out.print("enter the number :- ");
    int n= sc.nextInt();
    for(int i=1;i<=n;i++){
        if(n%i==0){
            System.out.println(i);
        }
    }
  }
}
class P31{
     public static void main(String[] age){
        Scanner sc= new  Scanner(System.in);
        System.out.println("enter the number :- ");
        int n= sc.nextInt();
        int i=1; 
        factor(n,i);
     }
    public static void factor(int n,int i){
    if(i<=n){
        if(n%i==0){
            System.out.println(i);
        }
        factor(n,i+1);
        return ;
      }
    }
}