package LL;

public class LL1 {
    public static void main(String[] args) {
       // Node n1=new Node(1);
        //Node n2=new Node(2);
        //n1.next=n2;
        //n1.printNode();
        LinkedList linkedlist=new LinkedList();

        for(int i=0;i<5;i++){
            linkedlist.insertAtTail(i);
        }
        //linkedlist.insertAtHead(10);
        //linkedlist.insertAtTail(11);
        linkedlist.printElements();
        linkedlist.rotateByOne(linkedlist.head);
        System.out.println("---");
        linkedlist.printElements();
        
    }
}
class LinkedList{
    Node head;
    public LinkedList(){
        this.head=null;
    }
    // inserting a node at tail
    public void insertAtTail(int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=new Node(data);
        return ;
    }
    //roating the linked list by one unit right
    
    public void rotateByOne(Node a){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;

        }
        int last=temp.next.data;
        Node first=new Node(last);
        temp.next=null;
        first.next=a;
        a=first;
    }

    // inserting a node at the head of LL
    public void insertAtHead(int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node temp=head;
        head =new Node(data);
        head.next=temp;
        return ;
        //can also write like below
        // Node new_head=new Node(data);
        // new_head.next=head ;
        // head=new_head ;
        //  return ;
    }

    // Adding an element in the middle of LL at kth position


    // method to delete an element
    public void deleteNode(int data){
        Node curr=head;
        while(curr.next.data!=data){
            curr=curr.next;

        }
        curr=curr.next.next;
        return ;
    }





    // printing all the elements of LL
    public void printLL(){
        Node curr=head;
        while(curr.next!=null){
            curr.printNode();
            curr=curr.next;
        }
        curr.printNode();
    }
    //printing the elements of LL
    public void printElements(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    public void printNode(){
        System.out.println(this.data+"->"+this.next);
    }
}
