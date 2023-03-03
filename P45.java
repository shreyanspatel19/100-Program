import java.util.Scanner;
 class P45{
  public static void main(String[] age){
  String hex = "7B";
  int count = 0;
  int ans = 0;
    for(int i = hex.length()-1; i >= 0; i--){
        if(hex.charAt(i)-'0'>16){
            ans += (hex.charAt(i)-'0'- 7) * Math.pow(16,count); 
        }else{
            ans += (hex.charAt(i)-'0') * Math.pow(16,count); 
        }
        count++;
    }
    System.out.println(ans);
    hex = "";
    while(ans != 0){
            hex = (ans % 8)+""+hex;
            ans = ans / 8;
    }
    System.out.println(hex);
  }
}