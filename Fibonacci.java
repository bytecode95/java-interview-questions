import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count: ");
        int count = sc.nextInt();
        sc.close();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" "+n2);
        int n;
        for(int i=0; i<count; i++){
            n=n2+n1;
            n1=n2;
            n2=n;
            System.out.print(" "+n);
        }
        

    }
}
