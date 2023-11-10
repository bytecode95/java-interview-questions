public class Node {
    int value;
    Node next;

    public Node() {
        System.out.println("Node object is creating");
    }

    public Node(int value) {
        System.out.println("Node object is creating");
        this.value = value;
    }

    public Node(int value, Node next) {
        System.out.println("Node object is creating");
        this.value = value;
        this.next = next;
    }
}
