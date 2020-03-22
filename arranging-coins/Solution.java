class Solution{

    public static int arrangeCoins(int n){
        int num = 0;
        for(int i = 1; i <= n; i++){
            n-=i;
            num = i;
        }
        return num;
    }
    public static void main(String[] args){
        //Test case 1
        int coins = 5;
        int n = arrangeCoins(coins);
        //We expect 2
        System.out.println(n);

        //Test case 2
        int coins2 = 8;
        int n2 = arrangeCoins(coins2);
        
        //We Expect 3
        System.out.println(n2);
    }
}