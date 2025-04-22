import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

        for (int i = 0; i < n - 2; i++) {
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

    public static void searchElement(int data) {

        System.out.println("\n🔹 Search Node element at linked list...");
        if (head == null) return;

        ListNode curr = head;
        int count = 1;

        while (curr != null) {

            if (data == curr.data) {
                System.out.println("element exist at pos[" + count + "]");
                return;
            }

            curr = curr.next;
            count++;
        }

        System.out.println("element not exist.");
    }

    public static void firstReverseLinkedList() {

        System.out.println("\n🔹 Reverse elements at linked list...");
        if (head == null) return;

        ListNode curr = head;
        ListNode newHead = null;

        while (curr != null) {

            ListNode newNode = new ListNode(curr.data);
            newNode.next = newHead;
            newHead = newNode;

            //increment to next iterator
            curr = curr.next;
        }

        display(newHead);

    }

    public static void secondReverseLinkedList() {

        System.out.println("\n🔹 Reverse elements at linked list...");
        if (head == null) return;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {

            // pos next after curr
            next = curr.next;

            curr.next = prev;
            prev = curr;

            // iterate to the next node
            curr = next;
        }

        display(prev);
    }

    public static void firstFindMiddleNode() {

        System.out.println("\n🔹 find Middle Node at linked list...");
        if (head == null) return;

        int n = length();
        int mid = n / 2;
        int counter = 0;

        ListNode curr = head;

        while (curr != null && counter < mid) {

            counter++;
            curr = curr.next;
        }

        System.out.println("middle node is: " + curr.data);
    }

    public static void secondFindMiddleNode() {

        System.out.println("\n🔹 find Middle Node at linked list...");
        if (head == null) return;

        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode != null && fastNode.next != null) {

            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        System.out.println(slowNode.data);
    }

    public static void findNTHElementFromEnd(int n) {

        System.out.println("\n🔹 find nth of element from the end of linked list...");
        if (head == null) return;

        ListNode refNode = head;
        ListNode mainNode = head;

        int counter = 0;

        while (counter < n) {
            refNode = refNode.next;
            counter++;
        }

        while (refNode != null) {

            refNode = refNode.next;
            mainNode = mainNode.next;
        }

        System.out.println("The " + n + " element from the end is: " + mainNode.data);
    }

    public static void deleteDuplicates() {

        System.out.println("\n🔹 Delete the Duplicates at linked list...");
        if (head == null) return;

        ListNode slowNode = head;
        ListNode fastNode = slowNode.next;
        ListNode prevNode = slowNode;

        while (fastNode != null) {

            if (fastNode.next == null && !Objects.equals(fastNode.data, slowNode.data)) {
                slowNode = slowNode.next;
                prevNode = slowNode;
                fastNode = slowNode.next;
            }
            if (Objects.equals(slowNode.data, fastNode.data)) {
                prevNode.next = fastNode.next;
                fastNode = prevNode;
            }

            prevNode = fastNode;
            fastNode = fastNode.next;
        }
        display();
    }

    public static void insertNodeAtSortedLinkedList(int data) {

        System.out.println("\n🔹 Insert Node at sorted linked list at linked list...");
        if (head == null) return;

        ListNode curr = head;
        ListNode temp = null;
        ListNode newNode = new ListNode(data);

        while (curr != null && newNode.data > curr.data) {

            temp = curr;
            curr = curr.next;
        }

        if (curr.data != newNode.data) {

            newNode.next = curr;
            temp.next = newNode;
        }

        display();
    }

    public static void generateLinkedListLoop() {

        ListNode first = new SingleLinkedList.ListNode(1);
        ListNode second = new SingleLinkedList.ListNode(2);
        ListNode third = new SingleLinkedList.ListNode(3);
        ListNode fourth = new SingleLinkedList.ListNode(4);
        ListNode fifth = new SingleLinkedList.ListNode(5);
        ListNode sixth = new SingleLinkedList.ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    public static ListNode generateFirstLinkedList() {

        ListNode head = new SingleLinkedList.ListNode(1);
        ListNode third = new SingleLinkedList.ListNode(3);
        ListNode fifth = new SingleLinkedList.ListNode(5);
//        ListNode seventh = new SingleLinkedList.ListNode(7);

        head.next = third;
        third.next = fifth;
//        fifth.next = seventh;

        return head;
    }

    public static ListNode generateSecondLinkedList() {

        ListNode head = new SingleLinkedList.ListNode(2);
        ListNode fourth = new SingleLinkedList.ListNode(4);
        ListNode sixth = new SingleLinkedList.ListNode(6);
//        ListNode eight = new SingleLinkedList.ListNode(8);
//        ListNode ninth = new SingleLinkedList.ListNode(9);
//        ListNode tenth = new SingleLinkedList.ListNode(10);

        head.next = fourth;
        fourth.next = sixth;
//        sixth.next = eight;
//        eight.next = ninth;
//        ninth.next = tenth;

        return head;
    }

    public static void findLoopInLinkedList() {

        System.out.println("\n🔹 Find if there a loop inside a linked list...");
        if (head == null) return;

//        generateLinkedListLoop();
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {

                displayLinkedListLoop();
                detectStartLoopInLinkedList(slow);
                return;
            }
        }
    }

    private static void displayLinkedListLoop() {

        Set<ListNode> visited = new HashSet<>();

        ListNode curr = head;

        while (curr != null) {

            if (visited.contains(curr)) {

                System.out.print(curr.data); //loop start from here
                break;
            }

            System.out.print(curr.data + "--> ");
            visited.add(curr);
            curr = curr.next;
        }

        if (curr == null)
            System.out.print("null");
    }

    public static void detectStartLoopInLinkedList(ListNode slwPtr) {

        if (head == null) return;

        System.out.println("\n🔹 Find from where the loop starts at a linked list...");
        ListNode temp = head;

        while (temp != null) {

            if (temp == slwPtr) {
                System.out.println("The loop start from here --> " + temp.data);
                return;
            }

            temp = temp.next;
            slwPtr = slwPtr.next;
        }
    }

    public static void removeLoopLinkedList() {

        if (head == null) return;
        System.out.println("\n🔹 Remove the loop at a linked list...");

        generateLinkedListLoop();
        displayLinkedListLoop();

        // first we have to find if the loop then detect from where its started

        ListNode fstPtr = head;
        ListNode slwPtr = head;

        while (fstPtr != null && fstPtr.next != null) {

            fstPtr = fstPtr.next.next;
            slwPtr = slwPtr.next;

            if (slwPtr == fstPtr)
                break;

        }

        ListNode temp = head;

        while(temp.next != slwPtr.next){
            temp = temp.next;
            slwPtr = slwPtr.next;
        }
        slwPtr.next = null;

        System.out.println("\nThe Linked List after removing the loop \uD83D\uDD01");
        displayLinkedListLoop();
    }

    public static void mergeTwoSortedLinkedList(){

        if (head == null) return;
        System.out.println("\n🔹 Merge Two Sorted Linked List...");

        ListNode a = generateFirstLinkedList();
        ListNode b = generateSecondLinkedList();

        ListNode newMergedList = new ListNode(0);
        ListNode tail = newMergedList;

        while(a != null && b != null){

            if(a.data <= b.data){
                tail.next = a;
                a = a.next;
            }else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a == null)
            tail.next = b;
        else
            tail.next = a;

        newMergedList = newMergedList.next;
        display(newMergedList);
    }

    public static void addTwoList(){

        if (head == null) return;
        System.out.println("\n🔹 Adding numbers of two Linked List...");

        ListNode a = generateFirstLinkedList();
        ListNode b = generateSecondLinkedList();

        display(a);
        display(b);

        ListNode newList = new ListNode(0);
        ListNode tail = newList;

        int carry = 0;

        while (a != null || b != null){

            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            tail.next = new ListNode(sum % 10);

            if (a != null) a = a.next;
            if (b != null) b = b.next;

            tail = tail.next;

        }

        if (carry > 0)
            tail.next = new ListNode(carry);

        newList = newList.next;
        display(newList);
    }

    public static void reorderList(){

        ListNode curr = head;
        ListNode tail = head;

        ListNode res = new ListNode(0);
        ListNode temp = res;

        while (curr.next != null){

            if (tail.next.next == null){
                temp.next = new ListNode(curr.data);
                temp = temp.next;
                temp.next = new ListNode(tail.next.data);
                temp = temp.next;

                tail.next = null;

                curr = curr.next;
                tail = curr;
            }

            tail = tail.next;
        }
        temp.next = curr;
        res = res.next;
        head = res;
        display(head);
    }
}
