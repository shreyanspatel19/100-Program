import java.util.Scanner;
 class P12{
  public static void main(String[] age){
  Scanner sc = new Scanner(System.in);
  System.out.print("enter the number :- ");
  int n= sc.nextInt();
  int temp,min=0,max=0;
  float avg=0;
    for(int i=1;i<=n;i++){
        temp=sc.nextInt();
        if(i==1){
            min=max=temp;
            // avg=(float)temp;
        }
        else{
            if(min>temp){
                min=temp;
            }
            if(max<temp){
                max=temp;
            }
        }
        avg+=(float)temp;
    }
    System.out.println(min+" "+max+" "+(avg/(float)n));
  }
}