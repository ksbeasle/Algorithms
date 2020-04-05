import java.util.*;
class Solution {

    public static int missingNums(int[] nums){
        int actual = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != actual){
                return actual;
            }
            actual++;
        }
        return nums[nums.length-1]+1;
    }

    public static void main(String[] args){
        //Test case 1
        int[] arr1 = {3,0,1};
        int res = missingNums(arr1);
        //we expect 2
        System.out.println(res);

        //Test case 2
        int[] arr2 = {9,6,4,2,3,5,7,0,1};
        int res1 = missingNums(arr2);
        //we expect 8
        System.out.println(res1);
    }
}