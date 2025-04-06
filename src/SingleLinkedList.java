import java.util.Objects;

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
        display();
    }

    public static void insertLastNode(int data) {

        System.out.println("\n🔹 Insert Last Node at linked list...");

        ListNode newNode = new ListNode(data);
        ListNode current = head;

        while (current.next != null) {

            current = current.next;
        }
        current.next = newNode;
        display();
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
        display();
    }

    public static void deleteFirstNode() {

        System.out.println("\n🔹 Delete first node at linked list...");
        if (head == null) return;
        head = head.next;
        display();
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
        display();
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
        display();
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

    public static void firstReverseLinkedList(){

        System.out.println("\n🔹 Reverse elements at linked list...");
        if (head == null) return;

        ListNode curr = head;
        ListNode newHead = null;

        while(curr != null){

            ListNode newNode = new ListNode(curr.data);
            newNode.next = newHead;
            newHead = newNode;

            //increment to next iterator
            curr = curr.next;
        }

        display(newHead);

    }

    public static void secondReverseLinkedList(){

        System.out.println("\n🔹 Reverse elements at linked list...");
        if (head == null) return;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

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

    public static void firstFindMiddleNode(){

        System.out.println("\n🔹 find Middle Node at linked list...");
        if (head == null) return;

        int n = length();
        int mid = n/2;
        int counter = 0;

        ListNode curr = head;

        while( curr != null && counter < mid){

            counter++;
            curr = curr.next;
        }

        System.out.println("middle node is: " + curr.data);
    }

    public static void secondFindMiddleNode(){

        System.out.println("\n🔹 find Middle Node at linked list...");
        if (head == null) return;

        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode != null && fastNode.next != null){

            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        System.out.println(slowNode.data);
    }

    public static void findNTHElementFromEnd(int n){

        System.out.println("\n🔹 find nth of element from the end of linked list...");
        if (head == null) return;

        ListNode refNode = head;
        ListNode mainNode = head;

        int counter = 0;

        while (counter < n ){
            refNode = refNode.next;
            counter++;
        }

        while(refNode !=null){

            refNode = refNode.next;
            mainNode = mainNode.next;
        }

        System.out.println("The " + n + " element from the end is: " + mainNode.data);
    }

    public static void deleteDuplicates(){

        System.out.println("\n🔹 Delete the Duplicates at linked list...");
        if (head == null) return;

        ListNode slowNode = head;
        ListNode fastNode = slowNode.next;
        ListNode prevNode = slowNode;

        while(fastNode != null){

            if (fastNode.next == null && !Objects.equals(fastNode.data, slowNode.data)){
                slowNode = slowNode.next;
                prevNode = slowNode;
                fastNode = slowNode.next;
            }
            if (Objects.equals(slowNode.data, fastNode.data)){
                prevNode.next = fastNode.next;
                fastNode = prevNode;
            }

            prevNode = fastNode;
            fastNode = fastNode.next;
        }
        display();
    }
}
