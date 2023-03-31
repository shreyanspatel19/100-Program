import java.util.Scanner;
 class P54{
  public static void main(String[] age){
  int a[] = {5,0,0,3};
  int avg = 0;
    for(int i = 0; i < a.length; i++ ){
        avg += a[i];
    }

    if(avg%a.length != 0){
        System.out.println("wrong washing machines");
    }
    avg = avg / a.length;
    int count = 0;
    int ans = 0;
    for(int m : a){
        count += m - avg; 
       ans = Math.max(ans ,Math.max(Math.abs(count),m-avg)); 
    }
    System.out.println("move is only :- "+ans);
  }
}