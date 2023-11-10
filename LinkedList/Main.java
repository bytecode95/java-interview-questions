public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertFirst(12);
        list.insertFirst(15);
        list.insertFirst(20);
        list.insertLast(35);
        list.insertLast(25);
        list.insert(8,2);
        list.insert(10, 5);
        list.insert(-3, 4);
        list.deleteFirst();

        list.display();
        System.out.println(list.size);

        list.deleteLast();

        System.out.println(list.size);
        list.display();

        list.delete(3);
        System.out.println(list.size);
        list.display();
    }
}
