// import java.util.Scanner;
import java.lang.*;
import java.util.*;
import java.util.List;
 class P19{
  public static void main(String[] age){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter by user array lenth :- ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            max = Math.max(max, a[i]);
        }
        BucketSort(a,max);
  }
  public static void BucketSort(int a[],int max){
    int nob=(int)Math.ceil((max+1)/2);
    System.out.println(nob);
    @SuppressWarnings("unchecked")
    Vector<Integer> b[] = new Vector[nob];
    for(int i=0;i<nob;i++){
        b[i]=new Vector<Integer>();
    }

    for(int i=0;i<a.length;i++){
        b[a[i]/nob].add(a[i]);
        System.out.println("i = "+i+" and where  "+b[a[i]/nob]+" b "+a[i]/nob+" what value add "+a[i]);
    }
    for (int i = 0; i < nob; i++) {
            Collections.sort(b[i]);
    }
    for(int i=0;i<nob;i++){
        for(int j=0;j<b[i].size();j++){
            System.out.print(" "+b[i].get(j));
        }

    }
  }
}