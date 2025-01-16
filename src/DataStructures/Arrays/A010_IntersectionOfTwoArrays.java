package DataStructures.Arrays;

import java.util.ArrayList;

public class A010_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        ArrayList<Integer> res=new ArrayList<>();
        // Set<Integer> res=new HashSet<>(); can also be used
        int[] arr1={1,2,2,3,3,4,5,6};
        int[] arr2={2,3,3,5,6,6,7};
        int i=0;
        int j=0;
        // two pointers approach: use while loop as for loop has i++ and j++
        while(i<arr1.length && j<arr2.length){
            // if arr1[i] is smaller move i
            if(arr1[i]<arr2[j]){
                i++;
            }
            // if arr2[j] is smaller move j
            else if(arr2[j]<arr1[i]){
                j++;
            }
            // if both match add element and  move both i and j
            else {
                res.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println("Intersection of Array: "+res);
    }
}

