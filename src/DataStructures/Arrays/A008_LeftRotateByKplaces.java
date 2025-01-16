package DataStructures.Arrays;

public class A008_LeftRotateByKplaces {
    public static void main(String[] args) {
        // brute force
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }
        int idx=0;
        for(int i=arr.length-k;i<arr.length;i++){
            arr[i]=temp[idx];
            idx++;
        }
        System.out.println("End Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

