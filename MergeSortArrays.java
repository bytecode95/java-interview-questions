import java.util.Arrays;

public class MergeSortArrays {
     public static void main(String[] args) {
        int[] num = {2,5,8,12,16,20};
        int[] arr = {3,6,8,9};
        int[] newArray = new int[num.length+arr.length];
        int i=0;
        int j=0;
        int k=0;
        int a = num.length;
        int b = arr.length;
        while(i<a && j<b){
           if(num[i]<arr[j]){
               newArray[k] = num[i];
               i++;
           }else{
               newArray[k] = arr[j];
               j++;
           }
           k++;
        }
        if(i<a){
           for(int t=i; t<a; t++){
               newArray[k] = num[t];
               k++;
           }
        }else{
            for(int s=j; s<b; s++){
                newArray[k] = arr[s];
                k++;
            }
        }
        System.out.println(Arrays.toString(newArray));

    }
}
