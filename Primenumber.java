import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sc.close();
        if(isPrime(num)){
            System.out.println("Number is prime number");
        }else{
            System.out.println("Number is not prime number");
        }
    }

    public static boolean isPrime(int num){
        if(num==0 || num==1){
            return false;
        }else if(num==2){
            return true;
        }else{
            for(int i=2; i<num; i++){
                if(num%i==0){
                   return false; 
                }
            }
            return true;
        }
    }
}
