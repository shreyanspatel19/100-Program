import java.util.*;
 class P27{
  public static void main(String[] age){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter by user array lenth :- ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        countingsort(a);
  }
  public static void countingsort(int arr[]){
    int larg=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
       larg =Math.max(larg,arr[i]);
    }

    int[] count=new int[larg+1];

    for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
    }
    int j=0;
    for(int i=0;i<count.length;i++){
       while(count[i]>0){
        arr[j]=i;
        j++;
        count[i]--;
       }
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
  }
}