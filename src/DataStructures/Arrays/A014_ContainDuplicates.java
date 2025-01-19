package DataStructures.Arrays;

public class A014_ContainDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,3,3,4,4,5};
        int[] arr1={1,2,3,4,5};
        int flag=0;
        for(int i=1;i<arr1.length;i++){
            if(arr1[i-1]==arr1[i]){
                flag=1;
            }
        }
        if(flag == 0){
            System.out.println("No duplicates");
        }
        else{
            System.out.println("Duplicates present");
        }
    }
}
