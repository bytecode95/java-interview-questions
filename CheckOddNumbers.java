public class CheckOddNumbers {
    public static void main(String[] args){
        int[] nums = {23, 15, 33, 17};
        if(oddnumberinArray(nums)){
            System.out.println("Array is having at least one even number");
        }else{
            System.out.println("All Array elements are odd");
        }

    }

    public static boolean oddnumberinArray(int[] nums){
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                return true;
            }
        }
        return false;
        
    }
}
