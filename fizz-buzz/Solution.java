import java.util.*;

class Solution{

    public static List<String> fizzbuzz(int n){
        List<String> al = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
            if(i%3 == 0 && i%5 == 0){
                al.add("FizzBuzz");
            }else if(i%3 == 0){
                al.add("Fizz");
            }else if(i%5 == 0){
                al.add("Buzz");
            }else{
                al.add(Integer.toString(i));
            }
        }
        return al;
    }
    public static void main(String[] args){
        //test case
        int n = 15;
        List<String> l = fizzbuzz(n);
        //expected ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
        System.out.println(l);
    }
}