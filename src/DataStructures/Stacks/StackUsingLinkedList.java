package DataStructures.Stacks;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Stack{
    Node head;
    public void push(int data){
        // create new node
        Node newNode=new Node(data);

        // if no nodes are present
        if(head==null){
            head=newNode;
            newNode.next=null;
            return;
        }

        // if nodes are present
        newNode.next=head;
        head=newNode;
    }
    public void pop(){
        Node currNode=head;

        // if no nodes are present
        if(head == null){
            System.out.println("No nodes to display");
        }

        // if one node is present
        if(head.next==null){
            System.out.println("Popped element: "+head.data);
            head=null;
        }

        // if multiple nodes are present
        System.out.println("Popped element: "+currNode.data);
        head=head.next;
    }
    public void peek(){
        System.out.println("Topmost element: "+head.data);
    }
    public void print(){
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
}
public class StackUsingLinkedList {
    public static void main(String[] args) {
       Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.print();
        System.out.println();
        s.pop();
        s.print();
        s.peek();
        s.print();
    }
}
