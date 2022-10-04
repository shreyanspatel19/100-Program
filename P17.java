import java.util.Scanner;
 class P17{
  public static void main(String[] age){
  Scanner sc = new Scanner(System.in);
  System.out.print("enter by user array lenth :- ");
    int temp,n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int x;
    System.out.println("sortet array ");
    int j;
    for(int i=1;i<n;i++){
        x=a[i];
        j=i-1;
        while((j>=0)&&(x<a[j])){
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=x;
    }  
    for(int i=0;i<n;i++){
        System.out.println(a[i]+" ");
    } 
  }
}