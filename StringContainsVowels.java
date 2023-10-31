import java.util.Scanner;

public class StringContainsVowels{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter word: ");
		String word = sc.next();
		
		word = word.toLowerCase();
		if (checkVowels(word)) {
            System.out.println("The string contains at least one vowel.");
        } else {
            System.out.println("The string does not contain any vowel.");
        }
        sc.close();
		
    }
    public static boolean checkVowels(String word){
		for(int i=0; i<word.length(); i++){
			char ch = word.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
				return true;
			}
		}
		return false;
	
	}   
}