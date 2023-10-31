public class Oddnumbers {
    public static void main(String[] args){
        int[] nums = {22, 45, 68, 33, 30, 89};
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2!=0){
                System.out.println(nums[i]+ " is a Odd number");
            }else{
				System.out.println(nums[i]+ " is a Even number");
			}
        }
    }
}
