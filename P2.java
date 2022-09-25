import java.util.Scanner;
 class P2{
  public static void main(String[] age){
    Scanner sc=new Scanner(System.in);
    boolean palindrome=true;
    String  s=sc.nextLine();
    int j=s.length()-1;
    for(int i=0;i<s.length()/2;i++){
        if(s.charAt(i)!=s.charAt(j)){
            palindrome=false;
        }
       j=j-1;
    }
    if(palindrome){
        System.out.println("String Is Palindrome");
    }
    else{
        System.out.println("String Is  Not Palindrome");
    }
  }
}