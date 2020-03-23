import java.util.*;
class Solution{

    public static void reverseString(char[] s){
        String str = "";
        for(int i = s.length-1; i >=0; i--){
            str+=s[i];
        }
        for(int i = 0; i < str.length(); i++){
            s[i] = str.charAt(i);
        }
    }
    public static void main(String[] args){
       //Test case 1
       char[] arr1 = {'h','e','l','l','o'};
    
       //We expect ['o','l','l','e','h'] or olleh
       reverseString(arr1);
       System.out.println(arr1);

       //Test case 2
       char[] arr2 = {'H', 'a', 'n', 'n', 'a', 'h'};

       //We expect hannaH
       reverseString(arr2);
       System.out.println(arr2);

    }
}