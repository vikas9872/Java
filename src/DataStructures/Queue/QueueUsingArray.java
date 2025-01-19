package DataStructures.Queue;

public class QueueUsingArray {
    int max=5;
    int[] arr=new int[max];
    int front=-1;
    int rear=-1;
    // enqueue
    // Enqueue
    public void enqueue(int data){
        // Check if queue is full
        if(rear==max-1){
            System.out.println("Queue is full");
        }
        // Insert the elements
        else{
            // Insert first element
            if((front==-1)&&(rear==-1)){
                front=rear=0;
                arr[rear]=data;
            }
            // If element is present
            else{
                rear++;
                arr[rear]=data;
            }
        }
    }
    // Dequeue
    public void dequeue(){
        // Check if queue is empty
        if((front==-1)&&(rear==-1)){
            System.out.println("No elements to delete");
        }
        // If elements are present
        else{
            // If there is only one element
            if(front==rear){
                System.out.print("Deleted element: "+arr[front]);
                front=-1;
                rear=-1;
            }
            // If multiple elements are present
            else{
                System.out.print("Deleted element: "+arr[front]);
                front++;
            }
        }
    }
    // Display
    public void display(){
        // Check if queue is empty
        if((front==-1)&&(rear==-1)){
            System.out.println("No elements to display");
        }
        // If elements are present
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        QueueUsingArray q=new QueueUsingArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println("Elements present in queue: ");
        q.display();
        System.out.println();
        q.dequeue();
        System.out.println();
        System.out.println("Elements present in queue after dequeue: ");
        q.display();
    }
}
