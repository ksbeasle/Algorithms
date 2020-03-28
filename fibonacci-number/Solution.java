class Solution {

    public static int fib(int N){
        if(N==0){
            return 0;
        }
        if(N <= 2){
            return 1;
        }
        return fib(N-1)+fib(N-2);
    }

    public static void main(String[] args){

        //Test case 1
        int N = 2;
        int res1 = fib(N);
        //expected 1
        System.out.println(res1);
        
        //Test case 2
        N = 3;
        int res2 = fib(N);
        //expected 2
        System.out.println(res2);

        //Test case 3
        N = 4;
        int res3 = fib(N);
        //expected 3
        System.out.println(res3);
    }
}