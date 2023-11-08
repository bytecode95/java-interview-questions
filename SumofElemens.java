public class SumofElemens {
    public static void main(String[] args){
        int[] nums = {2,4,7,-3,5};
        int total=0;
        for(int i=0; i<nums.length; i++){
            total+=nums[i];
        }
        System.out.println(total);
    }
}
