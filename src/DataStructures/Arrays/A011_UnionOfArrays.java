package DataStructures.Arrays;

import java.util.HashSet;
import java.util.Set;

public class A011_UnionOfArrays {
    public static void main(String[] args) {
        int[] arr1={1,1,2,3,4,5};
        int[] arr2={2,3,4,5,6};

        // brute force
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        System.out.println("Set bruteforce approach: "+set);

        // optimal approach -- yet to see
    }
}

