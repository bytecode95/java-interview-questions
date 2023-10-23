class ReverseArrays{
    public static void main(String[] args){
        int[] ar = {25, 36, 76, 58, 89, 100, 76, 10, 5};

        //inorder to access all element in an array --- access thought element index
        //index range is - (0, (ar.length-1))

        for(int i = ar.length-1;  i >=0; i--){
            System.out.println(ar[i]);
        }
    }
}