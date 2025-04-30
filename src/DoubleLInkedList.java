import java.util.List;
import java.util.NoSuchElementException;

public class DoubleLInkedList {


    ListNode head;
    ListNode tail;
    int length;

    public static class ListNode {

        private ListNode previous;
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.previous = null;
            this.data = data;
            this.next = null;
        }
    }

    public DoubleLInkedList() {
        this.head = null;
        this.length = 0;
        this.tail = null;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }// head == null

    public void displayForward() {

        System.out.print("null <--");
        if (head == null) return;
        ListNode curr = head;

        while (curr != null) {

            System.out.print(curr.data + "--> ");
            curr = curr.next;
            System.out.print("<--");
        }
        System.out.print(curr);
    }

    public void displayBackward() {

        if (tail == null) return;
        ListNode curr = tail;

        System.out.print("null <--");
        while (curr != null) {

            System.out.print(curr.data + "--> ");
            curr = curr.previous;
            System.out.print("<--");
        }
        System.out.print(curr);
    }

    public void insertAtFirst(int data) {

        ListNode newNode = new ListNode(data);
        if (isEmpty())
            tail = newNode;
        else
            head.previous = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {

        ListNode newNode = new ListNode(data);

        if (isEmpty())
            head = newNode;
        else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public void deleteFirstNode() {

        if (isEmpty()) return;

        ListNode temp = head;
        if (head == tail) tail = null;

        else {

            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        temp = null;


        System.out.println();
    }

    public void deleteLastNode(){

        if (isEmpty()) throw new NoSuchElementException();

        ListNode temp = tail;
        if (head == tail)
            head = null;
        else
            tail.previous.next = null;

        tail = tail.previous;
        temp.previous = null;
        temp = null;

        System.out.println();
    }
}
