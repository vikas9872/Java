package DataStructures.Arrays;

public class A013_InsertionPosition {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=5;
        int res=0;
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) {
                res=mid;
                break;
            }
            else if(nums[mid] > target) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println("Insertion position: "+res);
    }
}
