import java.util.NoSuchElementException;

public class CircularSingleLinkedList {

    private ListNode last;
    private int length;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void display() {

        if (last == null) return;
        ListNode first = last.next;

        while (first != last) {
            System.out.print(first.data + "--> ");
            first = first.next;
        }
        System.out.println(first.data + "------> " + first.next.data);
        System.out.println("len: " + getLength());
    }

    public void createCircular() {

        System.out.println("\n🔹 Circular Single linked list...");

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
        length = 4;
        display();
    }

    public void insertNodeAtFirst(int data) {

        ListNode newNode = new ListNode(data);
        if (last == null)
            last = newNode;
        else {
            newNode.next = last.next;
        }

        last.next = newNode;
        length++;
    }

    public void insertNodeAtEnd(int data) {

        ListNode newNode = new ListNode(data);

        if (last == null) {
            last = newNode;
            last.next = last;
        } else{
            newNode.next = last.next;
            last.next = newNode;
            last = last.next;
        }
        length++;
    }

    public void removeFirstNode(){

        if (isEmpty()) // means also last == null
        {
            System.out.println("len: " + getLength());
            return;
        }

        ListNode first = last.next;

        if (last == last.next)
            last = null;
        else
            last.next = first.next;
        first.next = null;
        length--;
    }
}
