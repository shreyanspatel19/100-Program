import java.util.Scanner;
 class P39{
  public static void main(String[] age){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number :- ");
    int n=sc.nextInt();
    int arr[]={1,2,3,4,5,6,7};
    rotate(arr,n);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
  }
  public static void rotate(int arr[],int n){
    reverse(arr,0,arr.length-n-1);
    reverse(arr,arr.length-n,arr.length-1);
    reverse(arr,0,arr.length-1);
  }
  public static void reverse(int arr[],int n,int m){
    int j=m,temp;
    int k=0;
    for(int i=n;k<(m-n)/2+1;i++){
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j--;
        k++;
    }
  }
}