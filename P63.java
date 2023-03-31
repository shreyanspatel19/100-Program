import java.io.*;
import java.util.*;

 class P63{
  public static void main(String[] age){
    int a[]={1,2,3};
    permutations(0,a);
  }

  public static void permutations(int i,int n[]){
    if(i == n.length){
        System.out.println(Arrays.toString(n));
        return ;
    }

    int temp;
    for(int j = i; j < n.length; j++){
        temp=n[i];
        n[i]=n[j];
        n[j]=temp;

        permutations(i+1,n);

        temp=n[j];
        n[j]=n[i];
        n[i]=temp;
    }
    return ;
  } 

}