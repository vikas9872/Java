package CollectionFrameworks.Stacks;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        // push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // print
        System.out.println("Elements present: ");
        for(int i=0;i< stack.size();i++){
            // get
            System.out.println(stack.get(i));
        }

        // size
        System.out.println("Size: "+stack.size());

        // pop
        System.out.println("Popped element: "+stack.pop());

        // isEmpty
        System.out.println("Is empty?: "+stack.isEmpty());

        // search
        System.out.println("Is 40 present in stack?: "+stack.search(40));

        // peek
        System.out.println("Upper most element: "+stack.peek());

        // print whole stack
        System.out.println("Stack: "+ stack);

    }
}

