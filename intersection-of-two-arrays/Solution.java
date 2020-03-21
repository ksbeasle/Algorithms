import java.util.*;
class Solution {
    public static int[] intersection(int[] nums1, int[] nums2){
        //HashSet to hold all the values of nums1 array
        HashSet<Integer> hs = new HashSet<Integer>();

        //List to hold all the nums that intersect
        List<Integer> al = new ArrayList<Integer>();

        //first loop through nums1 array and add all the values to the hashset
        for(int i = 0; i < nums1.length; i++){
            hs.add(nums1[i]);
        }
        

        // Loop through the nums2 array and only add numbers that intersect to the arraylist.
        for(int i = 0; i < nums2.length; i++){
            if(hs.contains(nums2[i])){
                if(!al.contains(nums2[i])){
                    al.add(nums2[i]);
                }
            }
        }

        //Now we use streams and maptoInt in order to get the primitive data type int into the array more info in readme
        int[] res = al.stream().mapToInt(i -> i).toArray();
        return res;
    }


    public static void main(String[] args){
        //Test case 1
        int[] array1 = {1,2,2,1};
        int[] array2 = {2,2};

        int[] result = intersection(array1, array2);

        //We expect '2' from result array
        for(int num : result){
            System.out.println(num);
        }

        //Test case 2
        int[] array3 = {4,9,5};
        int[] array4 = {9,4,9,8,4};

        int[] result2 = intersection(array3, array4);

        //We expect '9, 4' from result2 array
        for(int num : result2){
            System.out.println(num);
        }
    }
}


