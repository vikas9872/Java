package DataStructures.Arrays;

public class A012_ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int a=0;a<arr.length;a++){
            System.out.print(arr[a]+" ");
        }
    }
}
