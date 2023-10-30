public class SwapNumbers {
    public static void main(String[] args ){
        // Declare and initialize two numbers
        int a = 5;
        int b = 10;

        // Display the original values
        System.out.println("Original values: a = " + a + ", b = " + b);

        // Swap without using a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Display the values after swapping
        System.out.println("Values after swapping: a = " + a + ", b = " + b);
    }
}
