import java.util.*;
class Solution {

    public static boolean containsDuplicate(int[] nums){
        if(nums.length == 0 || nums.length == 1){
            return false;
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        //Test case 1
        int[] arr = {1,2,3,1};
        boolean b = containsDuplicate(arr);
        //we expect true
        System.out.println(b);

        //Test case 2
        int[] arr2 = {1,2,3,4};
        boolean b1 = containsDuplicate(arr2);
        //we expect false
        System.out.println(b1);

        //Test case 3
        int[] arr3 = {1,1,1,3,3,4,3,2,4,2};
        boolean b2 = containsDuplicate(arr3);
        //we expect true
        System.out.println(b2);

        //Test case 4
        int[] arr4 = {};
        boolean b3 = containsDuplicate(arr4);
        //we expect false
        System.out.println(b3);
    }
}