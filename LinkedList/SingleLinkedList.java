public class SingleLinkedList {
    Node head;
    Node tail;
    int size;

    public SingleLinkedList() {
        System.out.println("List is creating");
    }

    //methods
    //insertFirst
    public void insertFirst(int value){
        Node node = new Node();
        if(head==null){
            node.value = value;
            head= node;
            tail = node;
        }else{
            node.value = value;
            node.next =  head;
            head = node;
        }

        size++;
    }

    //insertLast
    public void insertLast(int value){
        if(head==null){
            insertFirst(value);
            return;
        }
        Node node = new Node();
        node.value = value;
        tail.next =  node;
        tail = node;

        size++;
    }

    //insert at any position
    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }

        Node temp = head;
        for(int i=1; i< index; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }
    //deleteFirst
    public void deleteFirst(){
        if(head==tail){
            head= null;
            tail=null;
        }else{
            head = head.next;

        }
        size--;
    }

    //delete last
    public void deleteLast(){
        Node secondLast = getNode(size-2);
        secondLast.next = tail.next;
        secondLast = tail;
        size--;
    }

    //delete at any position
    public void delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }

        Node prev = getNode(index-1);
        prev.next =  prev.next.next;
        size--;
    }

    //get node method
    public Node getNode(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    //display  method

    public void display(){
        try{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.value+" ->");
                temp = temp.next;

            }
            System.out.println("END");
        }catch (NullPointerException ex){
            System.out.println("Value is zero");
        }

    }
}
