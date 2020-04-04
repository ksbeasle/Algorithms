class Solution {

    public static int reverse(int x){
        boolean isNegative = false;
        if(x < 0){
            x = x * -1;
            isNegative = true;
        }

        String s = "";
        String ss = String.valueOf(x);
        char[] c = ss.toCharArray();

        for(int i = c.length-1; i >= 0; i--){
            s += c[i];
        }

        try {
            Integer res = Integer.valueOf(s);
        }catch(Exception e){
            return 0;
        }

        if(isNegative){
            return Integer.valueOf(s)*-1;
        }

        return Integer.valueOf(s);
    }

    public static void main(String[] args){
        //Test case 1
        int a = 123;
        int res = reverse(a);
        //we expect 321
        System.out.println(res);

        //Test case 2
        int a1 = -123;
        int res1 = reverse(a1);
        //we expect -321
        System.out.println(res1);

        //Test case 3
        int a2 = 120;
        int res2 = reverse(a2);
        //we expect 21
        System.out.println(res2);
    }
}