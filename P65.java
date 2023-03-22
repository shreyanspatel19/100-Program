import java.util.*;
 class P65{
      public static class Node{
        int data;
        Node next;

        public Node(){
        }
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head1;
    public static Node tail1;
    public static int size1;

    public static Node head2;
    public static Node tail2;
    public static int size2;
    public void addLast2(int data){
        Node newNode = new Node(data);
        size2++;
        if(head2==null){
            head2=tail2=newNode;
            return ;
        }

        tail2.next=newNode;
        tail2=newNode;
    }
    public void addLast1(int data){
        Node newNode = new Node(data);
        size1++;
        if(head1==null){
            head1=tail1=newNode;
            return ;
        }

        tail1.next=newNode;
        tail1=newNode;
    }
  public static void main(String[] age){
  P65 ll1 = new P65();
  P65 ll2 = new P65();
  ll1.addLast1(2);
  ll1.addLast1(4);
  ll1.addLast1(3);
  ll2.addLast2(5);
  ll2.addLast2(6);
  ll2.addLast2(4);
  AddTwoNumber(head1, head2);
  }
  public static void AddTwoNumber(Node l1, Node l2){
    Node dummy= new Node();
    Node temp = dummy;
    int sum = 0, carry = 0;
    while(l1 != null || l2 != null || carry == 1){
        sum = 0;
        if(l1 != null){
            sum += l1.data;
            l1 = l1.next;
        }
        if(l2 != null){
            sum += l2.data;
            l2 = l2.next;
        }
        sum += carry;
        carry = sum / 10;
        Node node = new Node(sum%10);
        temp.next =  node;
        temp = temp.next;
    }
    for(int i = 0;dummy.next!=null;i++){
      System.out.print(" "+dummy.next.data);
      dummy=dummy.next;
    }
  }
}