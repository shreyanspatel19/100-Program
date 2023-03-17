import java.util.Scanner;
 class P47{
  public static void main(String[] age){
    int n = 123;
    System.out.println(DecimaToHexadecimal(n));
  }
  public static int HexadecimalToDecimal(String s){
    int count = 0;
    int ans = 0;
        for(int i = s.length()-1; i >= 0; i--){
        if(s.charAt(i)-'0'>16){
            ans += (s.charAt(i)-'0'- 7) * Math.pow(16,count); 
        }else{
            ans += (s.charAt(i)-'0') * Math.pow(16,count); 
        }
        count++;
    }
    return ans;
  }
  public static String DecimaToHexadecimal(int n){
    String s = "";
    while(n != 0){
        if(n % 16 >= 10){
            s = (char)(n % 16 + '7') +""+s;
        }else{
            s = n % 16 +""+s;
        }
       
       n = n / 16;
    }
    return s;
  }
}