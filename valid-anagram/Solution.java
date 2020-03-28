import java.util.Arrays;

class Solution{

    public static boolean isAnagram(String s, String t){
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        String ss = new String(s1);
        String tt = new String(t1);
        return (ss.equals(tt)) ? true : false;
    }

    public static void main(String[] args){
        //Test case 1
        String s = "anagram";
        String t = "nagaram";

        //expected true
        System.out.println(isAnagram(s, t));

        String s1 = "rat";
        String t1 = "car";

        //expected false
        System.out.println(isAnagram(s1, t1));
    }
}