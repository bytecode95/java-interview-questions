public class StringAPI {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(System.identityHashCode(s1));  //1521118594
        System.out.println(System.identityHashCode(s2));  //1521118594

        System.out.println("s1 == s2 is:" + s1 == s2);  //false
        //this is because of the + operator give higher precedence than == operator
        //this checks "s1 == s2 is:s1"==s2 completely two diffrent String objects
        System.out.println("s1 == s2 is:" + (s1 == s2));  //true
        //this == operator checks objects reference whether they have pointeed to same object in string pool

        


    }
}
