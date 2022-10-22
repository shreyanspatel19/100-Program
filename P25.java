import java.util.Scanner;
 class P25{
    static int i=0;
  public static void main(String[] age){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter by user array lenth :- ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("which element is find ? ");
        int x=sc.nextInt();
        if(isInArray(a,x)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
  }
  public static boolean isInArray(int a[],int x){
        if(a[i]==x){
            return  true;
        }
        if(i==a.length-1){
            return false;
        }
        else{
            i++;
            return isInArray(a,x);
        }
    }
}