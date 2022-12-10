import java.util.Scanner;
 class Linklist{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addfrist(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return ;
        }

        newNode.next=head;
        // System.out.println(" -> "+head + " is of type " + ((Object)head).getClass().getSimpleName());
        head=newNode;
        // System.out.println(" -> "+head + " is of type " + ((Object)head).getClass().getSimpleName());
    }

    public void addIndex(int index,int data){
        if(index==0){
            addfrist(data);
            return ;
        }
        Node newNode= new Node(data);
        size++;
        Node temp=head;
        int i=0;
        
        

        while(i<=index-1){
            temp=temp.next;
           i++; 
        }
        newNode.next=temp.next;
            temp.next=newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return ;
        }

        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        if(head==null){
           System.out.println("link list is empty");
            return ;
        }

        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] age){
        Linklist ll = new Linklist();
        ll.print();
        ll.addfrist(1);
        ll.addfrist(2);
        ll.addLast(3);
        ll.print();
        ll.addfrist(4);
        ll.print();
        ll.addIndex(1,40);
        ll.print();
        System.out.println(ll.size);
    }
}