import java.util.Arrays;

public class MergeSortArray {
    public static void main(String[] args) {
        int[] nums = {4,1,5,25,3,9,6,-6,8,12,-3,3,9,0};
        //merge sort algorithm

        System.out.println(Arrays.toString(mergeSort(nums)));
    }

    private static int[] mergeSort(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int mid = nums.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);

    }

    private static int[] merge(int[] left, int[] right) {
        int i=0;
        int j=0;
        int k=0;
        int[] ans = new int[left.length+ right.length];

        while(i < left.length && j < right.length){
            if(left[i]<=right[j]){
                ans[k] = left[i];
                i++;
            }else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            ans[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;

    }
}
