import java.util.*;
 class St{
  public static void main(String[] age){
round();
//   System.out.println(areIsomorphic("aab","xxy"));
  }
  public static void round(){
       double xd = 2.1199;
    double mult = xd * 100.0;
    double add = mult + 0.5;
    int reuslts = (int) add;

    double result = reuslts / 100.0;

    System.out.println(result);// 2.13
  }
  public static boolean areIsomorphic(String str1,String str2)
    {
        HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
        for(int i = 0; i<str1.length(); i++){
            char c = str1.charAt(i);
            if(hm1.containsKey(c)){
                hm1.replace(c, hm1.get(c) + 1);
                
            }else{
              hm1.put(c, 1);
            }
        }
        System.out.println(hm1);
        for(int i = 0; i<str2.length(); i++){
            char c = str2.charAt(i);
            if(hm2.containsKey(c)){
                hm2.replace(c, hm2.get(c) + 1);
                
            }else{
              hm2.put(c, 1);
            }
        }
        System.out.println(hm2);
        
        if(hm1.size()!=hm2.size()){
         return false;   
        }
        
        for( Map.Entry<Character, Integer> entry : hm1.entrySet() ){
             if(!hm2.containsValue(entry.getValue())){
                 return false;
             }
        }
        return true;
        
    }
}