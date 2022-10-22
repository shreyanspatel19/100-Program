import java.util.Scanner;
 class P24{
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
    if(!deleteele(a,x)){
        System.out.println("element is not found");
    }else{
        System.out.println("element deleted ");
        for(int i=0;i<n-1;i++){
        System.out.print(a[i]+" ");
        }
    }
  }
  public static boolean deleteele(int a[],int x){
    for(int i=0;i<a.length;i++){
        if(a[i]==x){
            for(int j=i;j<a.length-1;j++){
                System.out.println(j);
                a[j]=a[j+1];
                System.out.println(j);
            }
            return true;
        }
    }
    return false;
  }
}