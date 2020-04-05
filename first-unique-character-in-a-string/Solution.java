import java.util.*;
class Solution {

    public static int firstUniqChar(String s){
        if(s.length() == 0){
            return -1;
        }

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i), 1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(hm.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        //Test case 1
        String s = "leetcode";
        int res = firstUniqChar(s);
        //we expect 0
        System.out.println(res);

        //Test case 2
        String s2 = "loveleetcode";
        int res2 = firstUniqChar(s2);
        //we expect 2
        System.out.println(res2);
    }
}