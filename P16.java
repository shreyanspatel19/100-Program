import java.util.Scanner;
import java.util.*;
 class P16{
  public static void main(String[] age){
    Scanner sc= new Scanner(System.in);
    System.out.print("enter by user array lenth");
    int temp,n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    for(int i=0;i<n;i++){
        System.out.println(a[i]+" ");
    }
  }
}