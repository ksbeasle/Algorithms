import java.util.HashMap;
import java.util.Map;



class Solution {

    public static int majorityElement(int[] nums){
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }else{
                hm.put(nums[i], 1);
            }
        }
        int max = hm.get(nums[0]);

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
            }
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() == max){
                return entry.getKey();
            }
        }
        //we should not reach this line
        return 0;
    }
    public static void main(String[] args){
        //Test case 1
        int[] arr1 = {3,2,3};
        int res = majorityElement(arr1);
        //expected 3
        System.out.println(res);

        //Test case 2
        int[] arr2 = {2,2,1,1,1,2,2};
        int res1 = majorityElement(arr2);
        //expected 2
        System.out.println(res1);
    }
}