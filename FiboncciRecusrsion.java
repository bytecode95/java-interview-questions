import java.util.Scanner;

public class FiboncciRecusrsion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        Fiboncci(n);
        sc.close();
    }

    public static void Fiboncci(int n){
        int a1=0;
        int a2=1;
        int a3=1;
        if(n>=3){
            for(int i=1; i<=n; i++){
                System.out.print(a1+", ");
                a1=a2;
                a2=a3;
                a3=a2+a1;
            }
        }else{
            System.out.print(a1+", "+a2);
        }
        
    }
}
