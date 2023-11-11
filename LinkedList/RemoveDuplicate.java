public class RemoveDuplicate {
    public static void main(String[] args) {
        /**
         * Definition for singly-linked list.
         * public class ListNode {
         *     int val;
         *     ListNode next;
         *     ListNode() {}
         *     ListNode(int val) { this.val = val; }
         *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         * }
         */

        //  Input: head = [1,1,2,3,3]
        //  Output: [1,2,3]

        
    }
    public static Node removeDuplicate(Node head){
        Node temp = head;
        while(temp.next!=null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }

        return head;
    }
}
