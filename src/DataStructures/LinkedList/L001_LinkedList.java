package DataStructures.LinkedList;

public class L001_LinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    // add First
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // addLast
    public void addLast(int data){
        Node newNode=new Node(data);
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        newNode.next=null;
    }

    // delete first
    public void deleteFirst(){
        // If list is empty
        if(head==null){
            System.out.println("No nodes to delete");
            return;
        }
        // If list has single node
        if(head.next==null){
            System.out.println("Deleted Node from the front: "+head.data);
            head=null;
        }
        // If list has multiple nodes
        else{
            System.out.println("Deleted Node from the front: "+head.data);
            head=head.next;
        }
    }
    // delete last
    public void deleteLast(){
        Node currNode=head;
        Node prevNode=head;
        if(head==null){
            System.out.println("No nodes to delete");
            return;
        }
        if(head.next==null){
            System.out.println("Deleted node from last: "+head.data);
            head=null;
        }
        while(currNode.next!=null){
            prevNode=currNode;
            currNode=currNode.next;
        }
        System.out.println("Deleted node from last: "+currNode.data);
        prevNode.next=null;
    }

    // delete specific index
    public void deleteatspecificindex(int index) {
        int count = 0;
        Node currNode = head;
        Node prevNode = null;
        if (head == null) {
            System.out.println("No nodes to display");
            return;
        }
        if (index == 1) {
            System.out.println("Deleted element at position 1: " + head.data);
            head = head.next;
            return;
        }
        while (currNode != null) {
            count++;
            if (count == index) {
                System.out.println("Element deleted at position " + count + ": " + currNode.data);
                prevNode.next = currNode.next;
                return;
            }
            prevNode = currNode;
            currNode = currNode.next;
        }
        System.out.println("Index out of bounds");
    }

    // delete by value
    public void deletebyvalue(int value) {
        Node currNode = head;
        Node prevNode = head;
        if (head == null) {
            System.out.println("No nodes to display");
            return;
        }
        if (head.data == value) {
            System.out.println("Deleted element: " + head.data);
            head = head.next;
            return;
        }
        while(currNode!=null){
            if(currNode.data == value){
                System.out.println("Deleted element: "+currNode.data);
                prevNode.next=currNode.next;
                return;
            }
            prevNode=currNode;
            currNode=currNode.next;
        }
    }

    // length
    public void lengthoflist(){
        int count=0;
        Node currNode=head;
        while (currNode!=null){
            count++;
            currNode=currNode.next;
        }
        System.out.println("Length of the list: "+count);
    }

    // search
    public void search(int searchElement){
        Node currNode=head;
        boolean found=false;
        int idx=0;
        while (currNode!=null){
            if(currNode.data==searchElement){
                found=true;
                break;
            }
            currNode=currNode.next;
            idx++;
        }
        if(found){
            System.out.println("Element found at index: "+idx);
        }else{
            System.out.println("Element not found");
        }
    }

    // reversed linked list
    public void reverseList(){
//        brute force
//        Stack<Integer> set=new Stack<>();
//        Node currNode=head;
//        while(currNode != null){
//            set.push(currNode.data);
//            currNode=currNode.next;
//        }
//        currNode = head;
//        while(currNode!=null){
//            currNode.data=set.pop();
//            currNode=currNode.next;
//        }
//        optimal solution

    }

    // print
    public void printList(){
        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        L001_LinkedList ll=new L001_LinkedList();
        // add first
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);

        // add last
        ll.addLast(100);
        ll.addLast(200);
        ll.addLast(300);
        ll.addLast(400);
        ll.addLast(500);

        // print
        ll.printList();
        System.out.println();

        // length
        ll.lengthoflist();

        // search
        ll.search(10);

        // delete first
        ll.deleteFirst();
        ll.printList();
        System.out.println();

        // delete last
        ll.deleteLast();
        ll.printList();
        System.out.println();

        // delete at specific index
        ll.deleteatspecificindex(3);
        ll.printList();
        System.out.println();

        // delete by value
        ll.deletebyvalue(40);
        ll.printList();
        System.out.println();

        // reverse
        ll.reverseList();
        ll.printList();
    }
}

