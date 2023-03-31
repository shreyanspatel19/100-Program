import java.util.*;
 class P62{
  public static void main(String[] age){
  String s = "bca";
  char c[] = s.toCharArray();
  System.out.println(s);
  ArrayList<Integer> al = new ArrayList<>();
    for(char ca : c){
        al.add(ca-'0');
    }

    int flage = 0;
    for(int i = 1; i<al.size(); i++){
        if(al.get(i-1)>al.get(i)){
            flage = 1;
        }
    }

    if(flage == 1){
        Collections.sort(al);
        System.out.println(al);
    }else{
        int temp = al.get(al.size()-1);
        al.set(al.size()-1,al.get(al.size()-2));
        al.set(al.size()-2,temp);
        
    }
  }
}