import java.util.*;
 class P46{
  public static void main(String[] age){
  int n = 12;
  System.out.println(DecimaTolOctal(OctalToDecimal(n)));

  }
    public static int DecimaTolOctal(int n){
    String hex = "";
    while(n != 0){
            hex = (n % 8)+""+hex;
            n = n / 8;
    }
    return Integer.parseInt(hex);
  }
  public static int OctalToDecimal(int oct){
     int ans=0;
    for(int i = 0; oct != 0; i++){
        ans += (oct % 10) * Math.pow(8, i);
        oct = oct / 10;
    } 
    return ans;
  }
}