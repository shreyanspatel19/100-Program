import java.util.Scanner;
 class P22{
  public static void main(String[] age){
  Scanner sc = new Scanner(System.in);
  System.out.print("enter number   :- ");
    int n=sc.nextInt();
    int a=0;
    char AB='A';
    for(int i=1;i<n;i++){
        for(int k=0;k<n-i;k++){
            System.out.print(" ");
        }
        for(int j=n-i;j<n;j++){
            if(i%2==0){
                System.out.print(AB+" ");
                AB++;
            }else{
                a++;
                System.out.print(a+" ");
            }
        }
        System.out.println();
    }
  }
 }
  class P221{
    public static void main(String[] age){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number   :- ");
        int n=sc.nextInt();
        if(n%2==0){
            for(int i=0;i<n/2+1;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=i;j<=n-i;j++){
                    System.out.print("*");
                
            }
            System.out.println();
            }
        }else{
            for(int i=0;i<n/2+1;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=i;j<n-i;j++){
                    System.out.print("*");
                
            }
            System.out.println();
            }
        }
    }
  }

  class P222{
    public static void main(String[] age){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number   :- ");
    int m=sc.nextInt();
    int n=m*2-1;
    int h=0;
    if(n%2!=0){
        for(int i=0;i<n/2;i++){
            for(int k=0;k<n/2-i;k++){
                System.out.print("*");
                h++;
            }
            for(int j=0;j<i+i;j++){
                    System.out.print(" ");
                    h++;
                
            }
            for(int k=h;k<n-1;k++){
                System.out.print("*");
            }
            h=0;
            System.out.println();
        }
    }else{
        for(int i=0;i<n/2;i++){
            for(int k=0;k<n/2-i;k++){
                System.out.print("*");
                h++;
            }
            for(int j=0;j<i+i;j++){
                    System.out.print(" ");
                    h++;
                
            }
            for(int k=h;k<n;k++){
                System.out.print("*");
            }
            h=0;
            System.out.println();
        }
    }
        
    }
  }
