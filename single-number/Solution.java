import java.util.HashMap;
import java.util.Map;

class Solution {

    public static int singleNumber(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }else{
                hm.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
                
            }
        }
        //should not hit this line
        return 0;
    }

    public static void main(String[] args){
        //Test Case 1
        int[] arr1 = {2,2,1};
        int res1 = singleNumber(arr1);
        //expected 1
        System.out.println(res1);

        //Test Case 2
        int[] arr2 = {4,1,2,1,2};
        int res2 = singleNumber(arr2);
        //expected 4
        System.out.println(res2);
    }
}