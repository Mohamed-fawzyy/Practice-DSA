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
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void display(ListNode head) {

        ListNode curr = head;

        while (curr.next != head){
            System.out.print(curr.data + "--> ");
            curr = curr.next;
        }
        System.out.println("--> " + curr.data + "-----> " + curr.next.data);
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
