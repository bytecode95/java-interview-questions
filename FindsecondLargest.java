import java.util.Arrays;

class FindsecondLargest{
    public static void main(String[] args){
        int[] arr = {2,5,-3,4,0,8,6,12,9};
        bubblesorting(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
    }

    public static void bubblesorting(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}