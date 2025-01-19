package DataStructures.Stacks;

public class StackUsingArray {
    int max=5;
    int[] arr = new int[max];
    int top=-1;

    // push
    public void push(int data){
        if(top==max-1) {
            System.out.println("Stack overflow");
        }
        else{
            top++;
            arr[top]=data;
        }
    }

    // peek
    public void peek(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        System.out.println("Top most element: "+arr[top]);
    }

    // print
    public void print(){
        System.out.println("Elements in stack: ");
        for(int i=top;i>-1;i--){
            System.out.print(arr[i]+" ");
        }
    }

    //pop
    public void pop(){
        if(arr[top]==-1){
            System.out.println("Stack underflow");
        }
        System.out.println("Deleted element: "+arr[top]);
        top--;
    }
    public static void main(String[] args) {
        StackUsingArray s=new StackUsingArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.peek();
        s.print();
        System.out.println();
        s.pop();
        s.print();
    }
}
