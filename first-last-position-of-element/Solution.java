import java.util.*;
class Solution{

    public static int[] searchRange(int[] nums, int target){
        List<Integer> al = new ArrayList<Integer>();
        for(int num : nums){
            al.add(num);
        }
        int[] indexOftarget = new int[2];

        indexOftarget[0] = al.indexOf(target);
        indexOftarget[1] = al.lastIndexOf(target);

        return indexOftarget;     
    }

    public static void main(String[] args){
        //Test case 1
        int[] array1 = {5,7,7,8,8,10};
        int target = 8;
        int[] res1 = searchRange(array1, target);
        //We expect [3,4]
        System.out.println(Arrays.toString(res1));

        //Test case 2
        int[] array2 = {5,7,7,8,8,10};
        int target2 = 6;
        int res[] = searchRange(array2, target2);

        //We expect [-1,-1]
        System.out.println(Arrays.toString(res));
    
    }
}