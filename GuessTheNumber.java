import java.util.*;
public class GuessTheNumber {
  public static void main(String[] args) {
    int finalNumber = 617283948;
    String[] operations = {"X + 9 5", "X - 0", "X + 1", "X / 2", "X ^ 1"};
        String[] parts = operations[0].split(" ");
        String operator = parts[1];
        int value = Integer.parseInt(parts[2]);
        System.out.println(operator);
        System.out.println(value);
    // int actualNumber = GuessTheNumber.getActualNumber(finalNumber, operations, operations.length);
    // System.out.println("The actual number will be " + actualNumber + " after performing given operations.");
  }

  public static int getActualNumber(int finalNumber, String[] operations, int totalOperations) {
    for(int i = 0; i < totalOperations; i++){
        String s = operations[totalOperations -1 - i];
        try{
            if(s.substring(2,3).equals("^")){
                finalNumber = (int)Math.pow(finalNumber,(1.0/Integer.parseInt(s.substring(4,s.length()))));
            }else if(s.substring(2,3).equals("*")){
                finalNumber = finalNumber/Integer.parseInt(s.substring(4,s.length()));
            }else if(s.substring(2,3).equals("/")){
                if(Integer.parseInt(s.substring(4,s.length())) == 0){
                    return -1;
                }
                finalNumber = finalNumber*Integer.parseInt(s.substring(4,s.length()));
            }else if(s.substring(2,3).equals("+")){
                finalNumber = finalNumber-Integer.parseInt(s.substring(4,s.length()));
            }else if(s.substring(2,3).equals("-")){
                finalNumber = finalNumber+Integer.parseInt(s.substring(4,s.length()));
            }
        }catch(Exception e){
            String ss = ""+e;
            if(ss.equals("java.lang.ArithmeticException: / by zero")){
                return -2;
            }
            System.out.println(e);
        }
    }
    return finalNumber;
  }
}