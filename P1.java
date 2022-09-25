import java.util.Scanner;
 class P1{
  public static void main(String[] age){
    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Length of Array :- ");
    int n=sc.nextInt();
    int array[] = new int[n];
    for(int i=0;i<n;i++){
      array[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      if(array[i]%2==0){
        sum=sum+array[i];
      }
    }
    System.out.println("sum of 1D array in even number  :- "+sum);
  }
}