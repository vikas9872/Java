package DataStructures.Arrays;

public class A005_LeftRotateArraybyOnePlace {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        // Assign first element to temp
        int temp=arr[0];
        // Shifting
        for(int i=1;i<arr.length;i++) {
            arr[i - 1] = arr[i];
        }
        // Add to last
        arr[arr.length-1]=temp;
        System.out.println("Rotated array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}

