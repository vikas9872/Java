package DataStructures.Stacks;

public class StackUsingLinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    // push
    public void push(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // print
    public void print(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print("null");
    }

    // pop
    public void pop(){
        if(head==null){
            System.out.println("No elements to pop");
        }
        int top=head.data;
        head=head.next;
        System.out.println("Popped element: "+top);
    }

    // peek
    public void peek(){
        if(head == null){
            System.out.println("No elements in stack");
        }
        System.out.println("Topmost element: "+head.data);
    }
    public static void main(String[] args) {
        StackUsingLinkedList s=new StackUsingLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.print();
        System.out.println();
        s.pop();
        s.peek();
        s.print();
    }
}
