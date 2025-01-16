package DataStructures.Arrays;

public class A007_LinearSearch {
    public static void main(String[] args) {
        int[] arr={1, 4, 2, 3, 5};
        int flag=0;
        int target=3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=i;
            }
        }
        if(flag == 0){
            System.out.println("Target is not found");
        }
        else{
            System.out.println("Target is found at index: "+flag);
        }
    }
}

