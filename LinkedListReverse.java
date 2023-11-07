import java.util.Collections;
import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(12);
        list.add(-5);
        list.add(8);
        list.add(20);
        list.add(-3);
        list.add(0);
        System.out.println("Before reversing "+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After reversing "+list);
    }
}
