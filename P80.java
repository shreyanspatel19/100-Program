import java.util.*;
 class P80{
    
  public static void main(String[] age){
  }

   Queue<Integer> q1 = new LinkedList<Integer>();
   Queue<Integer> q2 = new LinkedList<Integer>();

    public void push(int x) {
        if(!q1.isEmpty()){
            q1.add(x);
        }else{
           q2.add(x); 
        }
    }
    
    public int pop() {
        int t = -1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                t = q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(t);
            }
        }else{
            while(!q2.isEmpty()){
                t = q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(t);
            }
        }
        return t;
    }
    
    public int top() {
        int to = -1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                to = q1.remove();
                q2.add(to);
            }
        }else{
            while(!q2.isEmpty()){
                to = q2.remove();
                q1.add(to);
            }
        }
        return to;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}