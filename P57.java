import java.util.Scanner;
 class P57{
  public static void main(String[] age){
  int array[] = {2,2,2,1,1,1};
    if(array.length < 3){
        System.out.println(0); 
        return;
    } 
  int count = 1;
    for(int i = 1; i < array.length; i++){
        if(array[i] < array[i-1]){
            System.out.println(0);
            return;
        }       
        if(array[i] != array[i-1] && count < 3){
            System.out.println(0);
            return;
        }
        if(array[i] != array[i-1] && count == 3){
          count = 0;
        }
        count++;
    }
    if(count < 3){
    System.out.println(0);
    }else{
      System.out.println(1);
    }
  }
}