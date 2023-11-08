import java.util.Scanner;

public class ExceptionalHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number2: ");
        int num2 = sc.nextInt();

        
            try{
                int ans = num1/num2;
                System.out.println(ans);
            }catch(ArithmeticException ex){
                System.out.println("Please dont divide by 0");
            }

            System.out.println("End of the program");
        
    }
}
