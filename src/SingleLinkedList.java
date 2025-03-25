
public class SingleLinkedList {

    static ListNode head;

    public static class ListNode {
        Integer data;
        ListNode next;

        public ListNode(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void display() {

        ListNode curr = head;
        int n = length();

        while (curr != null) {
            System.out.print(curr.data + "--> ");
            curr = curr.next;
        }
        System.out.println("null.");
        System.out.println("length: " + n);
        System.out.println();
    }

    public static void display(ListNode head) {

        ListNode curr = head;
        int n = length(head);

        while (curr != null) {
            System.out.print(curr.data + "--> ");
            curr = curr.next;
        }
        System.out.println("null.");
        System.out.println("length: " + n);
        System.out.println();
    }

    private static int length() {
        int counter = 0;
        ListNode curr = head;

        while (curr != null) {
            curr = curr.next;
            counter++;
        }

        return counter;
    }

    private static int length(ListNode head) {
        int counter = 0;
        ListNode curr = head;

        while (curr != null) {
            curr = curr.next;
            counter++;
        }

        return counter;
    }

    public static void insertFirstNode(int data) {

        System.out.println("\n🔹 Insert First Node at linked list...");
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public static void insertLastNode(int data) {

        System.out.println("\n🔹 Insert Last Node at linked list...");

        ListNode newNode = new ListNode(data);
        ListNode current = head;

        while (current.next != null) {

            current = current.next;
        }
        current.next = newNode;
    }

    public static void insertNodeAtPosition(int data, int pos) {

        System.out.println("\n🔹 Insert Node at position [" + pos + "] for linked list...");
        if (pos == 1) {
            insertFirstNode(data);
        } else {

            ListNode newNode = new ListNode(data);
            ListNode curr = head;

            for (int i = 0; i < pos - 2; i++) {

                curr = curr.next;
            }

            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    public static void deleteFirstNode() {

        System.out.println("\n🔹 Delete first node at linked list...");
        if (head == null) return;
        head = head.next;
    }

    public static void deleteLastNode() {

        System.out.println("\n🔹 Delete last node at linked list...");
        if (head == null) return;

        ListNode curr = head;
        int n = length();

        for (int i = 0; i < n-2; i++) {
            curr = curr.next;
        }
        curr.next = null;
    }

    public static void deleteNodeAtPosition(int pos) {

        System.out.println("\n🔹 Delete Node at position [" + pos + "] for linked list...");
        if (pos == 1) {
            deleteFirstNode();
        } else {

            ListNode curr = head;

            for (int i = 0; i < pos - 2; i++) {
                curr = curr.next;
            }

            curr.next = curr.next.next;
        }
    }

    public static void searchElement(int data){

        System.out.println("\n🔹 Search Node element at linked list...");
        if (head == null) return;

        ListNode curr = head;
        int count = 1;

        while (curr != null){

            if (data == curr.data) {
                System.out.println("element exist at pos[" + count + "]");
                return;
            }

            curr = curr.next;
            count++;
        }

        System.out.println("element not exist.");
    }

//    public static void reverseLinkedList(){
//
//        System.out.println("\n🔹 Reverse elements at linked list...");
//        if (head == null) return;
//
//        ListNode curr = head;
//        ListNode newHead = null;
//
//        while(curr != null){
//
//            ListNode newNode = new ListNode(curr.data);
//            newNode.next = newHead;
//            newHead = newNode;
//
//            //increment to next iterator
//            curr = curr.next;
//        }
//
//        display(newHead);
//
//    }

    public static void reverseLinkedList(){

        if (head == null) return;

        //       curr nex
        // head-> 1--> 2--> 3--> null

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr != null){

            // pos next after curr
            next = curr.next;

            curr.next = prev;
            prev = curr;

            // iterate to the next node
            curr = next;
        }

        display(prev);
    }
}
