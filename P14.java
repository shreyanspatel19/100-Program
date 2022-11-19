import java.util.Scanner;
 class P14{
  public static void main(String[] age){
  Scanner s= new Scanner(System.in);
  System.out.print("input :- ");
  int a,ha,ma,h=s.nextInt();
  int m=s.nextInt();
  
    if (h <0 || m < 0 || h >12 || m > 60)
     System.out.println("Wrong input");
        if (h == 12)
            h = 0;
        if (m == 60)
        { m = 0;
          h += 1;
            if(h>12)
              h = h-12;
        }
 
        ha = (int)(0.5 * (h*60 + m));
        ma = (int)(6*m);
 
        a = Math.abs(ha - ma);
 
        a = Math.min(360-a, a);
        System.out.println(a);
  }
}