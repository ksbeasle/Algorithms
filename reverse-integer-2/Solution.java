class Solution {

    public static int reverse(int x){
        int reverse = 0;
        while(x != 0){
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        return reverse;
    }

    public static void main(String[] args){
        int a = 123;
        int b = 8123;
        int c = -321;
        System.out.println(reverse(a));
        System.out.println(reverse(b));
        System.out.println(reverse(c));
    }
}