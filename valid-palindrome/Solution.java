import java.util.*;
class Solution {
    public static boolean isPalindrome(String s){
        String a = s.replaceAll("[^a-zA-Z0-9]", "");
        String rev = "";
        for(int i = a.length()-1; i >= 0; i--){
            rev+=a.charAt(i);
        }
        a = a.toLowerCase();
        rev = rev.toLowerCase();
        if(a.equals(rev)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        //Test case 1
        String s1 = "A man, a plan, a canal: Panama";
        boolean res = isPalindrome(s1);
        // we expect true
        System.out.println(res);


        //Test case 2
        String s2 = "race a car";
        boolean res2 = isPalindrome(s2);
        //we expect false
        System.out.println(res2);
    }
}