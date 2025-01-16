package CollectionFrameworks.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist=new ArrayList<>();

        // add
        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);
        arrlist.add(40);
        arrlist.add(50);

        // add in specific index
        arrlist.add(2,100);

        // print
        System.out.println("Array list"+arrlist);

        // get
        int getElement=arrlist.get(2);
        System.out.println("Element in index 2: "+getElement);

        // set
        arrlist.set(2,500);

        // remove
        arrlist.remove(4);

        // size
        int arrlistSize=arrlist.size();
        System.out.println("Size of arraylist: "+arrlistSize);

        System.out.println("Final arraylist: "+arrlist);

        // looping
        System.out.println("Getting each element using loop: ");
        for(int i=0;i<arrlistSize;i++){
            System.out.print(arrlist.get(i)+" ");
        }
        System.out.println();

        // sort
        Collections.sort(arrlist);
        System.out.println("Array list after sorting: "+arrlist);
    }
}

