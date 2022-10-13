import java.util.Scanner;
 class P18{
  public static void main(String[] age){
  Scanner sc = new Scanner(System.in);
  System.out.print("enter by user array lenth :- ");
    int n=sc.nextInt();
    int[] A=new int[n];
    for(int i=0;i<n;i++){
        A[i]=sc.nextInt();
    }
    int minj,minx,j;
    for(int i=0;i<n;i++){
        minj=i;
        minx=A[i];
        for(j=i+1;j<n;j++){
            if(A[j]<minx){
                minj=j;
                minx=A[j];
            }
        }
        A[minj]=A[i];
        A[i]=minx;
    }

    for(int i=0;i<n;i++){
        System.out.println(A[i]+" ");
    }
  }
}