import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();

    }

    public static int factorial(int n){
        int total = 1;
        for(int i=1; i<=n; i++){
            total*= i;
        }
        return total;
    }
}
