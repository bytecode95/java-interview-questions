import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = sc.next();
        str = str.toLowerCase();
        
        if(checkVowel(str)){
            System.out.println("Word is having at least one Vowel ");
        }else{
            System.out.println("Word is not having at least one Vowel ");
        }
        
    }

    public static boolean checkVowel(String str){
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                return true;
            }
        }
        return false;
    }
}
