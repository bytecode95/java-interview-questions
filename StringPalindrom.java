import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        if(str.equals(checkpalindrome(str))){
            System.out.println("String is palindrome!");
        }else{
            System.out.println("String is not palindrome");
        }
        sc.close();
    }

    public static String checkpalindrome(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev+= str.charAt(i);
        }
        return rev;
    }
}
