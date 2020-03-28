import java.util.*;
class Solution {
    public static void moveZeroes(int[] nums){
        int zeroCount = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                al.add(nums[i]);
            }else{
                zeroCount++;
            }
        }
        for(int i = 0; i < al.size(); i++){
            nums[i] = al.get(i);
        }
        int lastIndex = nums.length-1;
        while(zeroCount != 0){
            nums[lastIndex] = 0;
            lastIndex--;
            zeroCount--;
        }
    }

    public static void main(String[] args){
        //Test case 1
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        //expected [1,3,12,0,0]
        System.out.println(Arrays.toString(arr));
    }
}