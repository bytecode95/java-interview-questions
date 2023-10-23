public class ReverseString {
    public static void main(String[] args){
        String name = "chethana";
        //System.out.println(name.length());
        
        //method1--traditional for loop to iterate through the characters of the string. It uses the charAt method to access each character at the specified index.
        
        for(int i=name.length()-1; i>=0; i--){
            System.out.println(name.charAt(i));
        }
        
        System.out.println("-----------------------");
        //for each is a enhanced for loop for print all chnarcters in an array

        System.out.println(name.toCharArray());

        //method2 - foreach
        for(char character: name.toCharArray()){
            System.out.println(character);

        }


    }
}
