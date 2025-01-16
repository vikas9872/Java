package DataStructures.Arrays;

public class A009_FindMissingNumber {
    public static void main(String[] args) {
        int[] arr1={1, 2, 4, 5, 6};
        for(int i=1;i<=arr1.length;i++){
            int flag=0;
            for(int j=0;j<arr1.length-1;j++){
                if(i == arr1[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Missing element by brutefroce: "+i);
            }
        }
    }
}