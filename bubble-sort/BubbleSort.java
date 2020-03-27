import java.util.Arrays;
class BubbleSort{
    public static int[] bubbleSort(int[] a){
        boolean swap = true;
        while(swap){
            swap = false;
            for(int i = 0; i < a.length-1;i++){
                if(a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    swap = true;
                }
            }
        }
        return a;
    }

    public static void main(String[] args){
        
        //Test case 1
        int[] a = {4,5,2,6,7,56,-1};
        int[] resA = bubbleSort(a);
        //expected [-1, 2, 4, 5, 6, 7, 56]
        System.out.println(Arrays.toString(resA));


        //Test case 2
        int[] b = {9,8,7,6,5,4,3,2,11,99999,-12312};
        int[] resB = bubbleSort(b);
        //expected [-12312, 2, 3, 4, 5, 6, 7, 8, 9, 11, 99999]
        System.out.println(Arrays.toString(resB));
    }
}