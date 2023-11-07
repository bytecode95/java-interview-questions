public class BinarySearch {
    public static void main(String[] args){
        int[] nums = {-5,-3,2,5,6,8,11,15,17,20,27,36,48,55}; //sorted array
        int target = 11;

        System.out.println(binarySearch(nums, target));

    }


    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length;
        int middle;
        while(start<=end){
            middle = start + (end-start)/2;
            if(nums[middle]==target){
                return middle;
            }else if(nums[middle]>target){
                end = middle - 1;
            }else if(nums[middle]<target){
                start = middle + 1;
            }
        }
        return -1;

    }
}
