import java.util.Arrays;
class Solution{
    public static int[] sortedSquares(int[] A){

        int[] res = new int[A.length];

        for(int i = 0; i < A.length; i++){
            res[i] = A[i] * A[i];
        }
        Arrays.sort(res);
        return res;
    }

    public static void main(String[] args){
        //Test case 1
        int[] array1 = {-4, -1, 0, 3, 10};

        int[] res1 = sortedSquares(array1);
        
        //We expect [0,1,9,16,100]
        System.out.println(Arrays.toString(res1));

        //Test case 2
        int[] array2 = {-7, -3, 2, 3, 11};
        int[] res2 = sortedSquares(array2);

        //We expect [4,9,9,49,121]
        System.out.println(Arrays.toString(res2));
    }
}