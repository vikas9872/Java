package DataStructures.Arrays;

import java.util.Arrays;
public class A002_SecondLargestElement {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 9, 8, 6, 6, 8 };
        // brute force
        int largestforBruteforce=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestforBruteforce){
                largestforBruteforce=arr[i];
            }
        }
        Arrays.sort(arr);
        int secondlargestforBruteforce=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=largestforBruteforce) {
                secondlargestforBruteforce = arr[i];
                break;
            }
        }
        System.out.println("Second largest element using brute force: "+secondlargestforBruteforce);

        // optimal solution
        int[] arr1={1, 2, 3, 9, 6, 6, 7, 7 };
        int largestforOptimal=arr[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>largestforOptimal){
                largestforOptimal=arr1[i];
            }
        }
        int secondlargestforoptimal=Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>secondlargestforoptimal && arr1[i]!=largestforOptimal){
                secondlargestforoptimal=arr1[i];
            }
        }
        System.out.println("Second largest element using optimal: "+secondlargestforoptimal);
    }
}

