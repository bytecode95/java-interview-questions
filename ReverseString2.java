import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = sc.next();
        System.out.println("Reverse String of "+ str+ " is: "+reverseString(str));
        sc.close();
        
    }

    public static String reverseString(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
