import java.util.*;
 class P41{
  public static void main(String[] age){
  int n = 130;
  ArrayList<Integer> al = new ArrayList<>();
    if(n<0){
        n = n*-1;

        while (n != 0){
        al.add(n % 10); 
        n /= 10 ;
        }
        Collections.sort(al, Collections.reverseOrder());
        al.set(0,al.get(0)*-1);
        System.out.println(al);
        return ;
    }
    else{
        while (n != 0){
            al.add(n % 10); 
            n /= 10 ;
        }
        Collections.sort(al);
        n=0;
        for(int i : al){
            if(i != 0){
                break;
            }
            n++;
        }
        al.set(0,al.get(n));
        al.set(n,0);
        System.out.println(al);
        }
    }
}