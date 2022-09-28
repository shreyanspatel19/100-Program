import java.util.Scanner;
 class P13{
  public static void main(String[] age){
   System.out.println("Hello, World!"); 
         System.out.println("Hello, \nWorld!");
            int n;
     System.out.print("enter the length of arrys :- ");
     Scanner s = new Scanner(System.in);
     n=s.nextInt();
     int arry1[][]=new int[n][n];
     int arry2[][]=new int[n][n];
     int ans[][]=new int[n][n];

    System.out.println("enter first  arry1 :- ");

     for(int i=0;i<arry1.length;i++){
       for(int j=0;j<arry1.length;j++){
         System.out.print( i+"  " +j+ ":- " );
       arry1[i][j]=s.nextInt();
      }
     }
    System.out.println("enter second  arry2 :- ");
    
     for(int i=0;i<arry1.length;i++){
       for(int j=0;j<arry1.length;j++){
         System.out.print( i+"  " +j+ ":- " );
       arry2[i][j]=s.nextInt();
      }
     }

     for(int i=0;i<arry1.length;i++){
       for(int j=0;j<arry1.length;j++){
           ans[i][j]=0;
        for(int k=0;k<arry1.length;k++){
           ans[i][j]=ans[i][j] + ( arry1[i][k]*arry2[k][j] );
        }   
      }
     }
     
     for(int i=0;i<arry1.length;i++){
       for(int j=0;j<arry1.length;j++){

         System.out.print(" " +ans[i][j]+"  ");

       }
       System.out.println();
     }

  }
}

class java{
    public static void main (String[] age){
        System.out.println("shreyans padmani");
        System.out.println("darshan hadala iit hoo");

        //    int n;
    //  System.out.print("enter the length of arrys :- ");
     Scanner s = new Scanner(System.in);
    //  n=s.nextInt();
     int arry1[][]=new int[3][3];
     int arry2[][]=new int[3][3];
     int ans[][]=new int[3][3];

    System.out.println("enter first  arry1 :- ");

     for(int i=0;i<arry1.length;i++){
       for(int j=0;j<arry1.length;j++){
         System.out.print( i+"  " +j+ ":- " );
       arry1[i][j]=s.nextInt();
      }
     }
    System.out.println("enter second  arry2 :- ");
    
     for(int i=0;i<arry1.length;i++){
       for(int j=0;j<arry1.length;j++){
         System.out.print( i+"  " +j+ ":- " );
       arry2[i][j]=s.nextInt();
      }
     }

     for(int i=0;i<arry1.length;i++){
       for(int j=0;j<arry1.length;j++){
         ans[i][j]=arry1[i][0]*arry2[0][j]+arry1[i][1]*arry2[1][j]+arry1[i][2]*arry2[2][j];
          System.out.print(" " +ans[i][j]+"  ");

        //  ans[0][0]=arry1[0][0]*arry2[0][0]+arry1[0][1]*arry2[1][0]+arry1[0][2]*arry2[2][0];
        //  ans[0][1]=arry1[0][0]*arry2[0][1]+arry1[0][1]*arry2[1][1]+arry1[0][2]*arry2[2][1];
        //  ans[0][2]=arry1[0][0]*arry2[0][2]+arry1[0][1]*arry2[1][2]+arry1[0][2]*arry2[2][2];

        //  ans[1][0]=arry1[1][0]*arry2[0][0]+arry1[1][1]*arry2[1][0]+arry1[1][2]*arry2[2][0];
        //  ans[1][1]=arry1[1][0]*arry2[0][1]+arry1[1][1]*arry2[1][1]+arry1[1][2]*arry2[2][1];
        //  ans[1][2]=arry1[1][0]*arry2[0][2]+arry1[1][1]*arry2[1][2]+arry1[1][2]*arry2[2][2];

        //  ans[2][0]=arry1[2][0]*arry2[0][0]+arry1[2][1]*arry2[1][0]+arry1[2][2]*arry2[2][0];
        //  ans[2][1]=arry1[2][0]*arry2[0][1]+arry1[2][1]*arry2[1][1]+arry1[2][2]*arry2[2][1];
        //  ans[2][2]=arry1[2][0]*arry2[0][2]+arry1[2][1]*arry2[1][2]+arry1[2][2]*arry2[2][2];
      }
      System.out.println();
     }
    //       for(int i=0;i<arry1.length;i++){
    //    for(int j=0;j<arry1.length;j++){

    //      System.out.print(" " +ans[i][j]+"  ");

    //    }
    //    System.out.println();
    //  }



    }
}

