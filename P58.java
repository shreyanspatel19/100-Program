import java.util.*;
 class P58{
  public static void main(String[] age){
    int n = 82;
    ArrayList<Integer> hm = new ArrayList<>();
    happyNumber(n, hm);
  }

    public static void happyNumber(int n, ArrayList<Integer> hm){
        if(n == 1){
            System.out.println("this number is happy  "+hm.get(0));
            return ;
        }

        if(hm.contains(n)){
            System.out.println("this number is not happy  "+hm.get(0));
            return ;
        }

            hm.add(n);
            happyNumber(digitSquare(n) , hm);
            
        return ;
    }

    public static int digitSquare(int n){
        String s = ""+n+"";
        n = 0;
        for(int i = s.length()-1; i>=0; i--){
            n += Math.pow(s.charAt(i)-'0',2);
        }
        return n;
    }

}