package DataStructures.Arrays;

import java.util.HashSet;
import java.util.Set;
public class A004_RemoveDuplicatesWithoutExtraSpace {
    public static void main(String[] args) {
        // brute force
        Set<Integer> set=new HashSet<>();
        int[] arr1={1, 2, 2, 3, 3, 3, 4, 4, 5, 5 };
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        System.out.println("Set length: "+set.size());

        // optimal approach
        int[] arr2={1, 1, 2, 2, 3, 4,};
        int idx=0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]!=arr2[idx]){
                idx++;
                arr2[idx]=arr2[i];
            }
        }
        System.out.println("Array2 elements: ");
        for(int i=0;i<idx;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("Whole array: ");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}

