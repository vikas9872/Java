package DataStructures.Arrays;

import java.util.Arrays;

public class A001_LargestElement {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 9, 8, 6 };
        // brute force
        Arrays.sort(arr);
        int maxforBruteforce=0;
        for(int i=0;i<arr.length;i++){
            maxforBruteforce=arr[arr.length-1];
        }
        System.out.println("Maximum element using brute force: "+maxforBruteforce);

        // optimal solution
        int[] arr1={1, 2, 3, 9, 8, 6, 10};
        int max=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        System.out.println("Maximum element using optimal: "+max);
    }
}
