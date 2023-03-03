import java.util.*;
 class P44{
  public static void main(String[] age){
  int oct = -6557;
  int ans = 0;
  String as="";
    for(int i = 0; oct != 0; i++){
        ans += (oct % 10) * Math.pow(8, i);
        oct = oct / 10;
    }
    while(ans != 0){
        if(ans % 16 >= 10){
            char a = (char)(ans % 16 + 55);
            as = a+""+as;
        }else
            as = ans % 16+""+as ;
        ans = ans /16;
    }
    System.out.println(as);
  }
}