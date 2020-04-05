class Solution {

    public static int getSum(int a, int b){
        int count = 0;

        if(a > 0){
            while(a != 0){
                count++;
                a--;
            }
        }else{
            while(a != 0){
                count--;
                a++;
            }
        }

        if(b > 0){
            while(b != 0){
                count++;
                b--;
            }
        }else{
            while(b != 0){
                count--;
                b++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        //Test case 1
        int a1 = 1;
        int b1 = 2;
        int res = getSum(a1,b1);
        //we expect 3
        System.out.println(res);

        //Test case 2
        int a2 = -2;
        int b2 = 3;
        int res1 = getSum(a2,b2);
        //we expect 1
        System.out.println(res1);
    }
}