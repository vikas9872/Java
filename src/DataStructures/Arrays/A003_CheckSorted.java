package DataStructures.Arrays;

public class A003_CheckSorted {
    public static void main(String[] args) {
        int[] arr1={1, 2, 3, 4, 5, 6 };
        int[] arr2={1, 4, 5, 3, 6};
        int flag1=0;
        int flag2=0;

        // arr1
        for(int i=0;i<arr1.length-1;i++){ // iterate till last but one element
            if(arr1[i]>arr1[i+1]) {
                flag1 = 1;
                break;
            }
        }
        if (flag1 == 0) {
            System.out.println("Array 1 is sorted");
        } else {
            System.out.println("Array 1 is not sorted");
        }

        // arr2
        for(int i=0;i<arr2.length-1;i++){
            if(arr2[i]>arr2[i+1]){
                flag2=1;
                break;
            }
        }
        if (flag2 == 0) {
            System.out.println("Array 2 is sorted");
        } else {
            System.out.println("Array 2 is not sorted");
        }
    }
}

