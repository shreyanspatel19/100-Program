import java.io.*;
import java.util.*;
 class P31{
  public static void main(String[] age){
    int array[]={5,1,10,2,12,3};
    ShellSort(array);
  }

  public static void ShellSort(int array[]){
    int n = array.length;
    int temp;
    for(int gap=n/2;gap>=1;gap/=2){
        for(int j=gap;j<n;j++){
            for(int i=j-gap;i>=0;i-=gap){
                if(array[i+gap]>array[i]){
                    break;
                }else{
                    temp=array[i+gap];
                    array[i+gap]=array[i];
                    array[i]=temp;
                }
            }
        }
    }
    System.out.println(Arrays.toString(array));
  }
  public static void swap(int a,int b){
    int temp;
    temp=a;
    a=b;
    b=temp;
  }
}