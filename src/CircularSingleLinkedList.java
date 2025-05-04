public class CircularSingleLinkedList {

    private ListNode last;
    private int length;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public int getLength() {
        return length+1;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void display(ListNode head) {

        ListNode first = last.next;

        while (first != last){
            System.out.print(first.data + "--> ");
            first = first.next;
            length++;
        }
        System.out.println("--> " + first.data + "------> " + first.next.data);
        System.out.println("length: " + getLength());
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
        display(first);
    }
}
