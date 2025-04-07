
public class Main {
    public static void main(String[] args) {
        System.out.println("\n🚀 Welcome to Java DSA Practice!");

        // Single linked list
        System.out.println("\n🔹 Running Single linked list...");

        SingleLinkedList.head = new SingleLinkedList.ListNode(2);

        SingleLinkedList.ListNode second = new SingleLinkedList.ListNode(4);
        SingleLinkedList.ListNode third = new SingleLinkedList.ListNode(8);
        SingleLinkedList.ListNode fourth = new SingleLinkedList.ListNode(12);

        SingleLinkedList.head.next = second;
        second.next = third;
        third.next = fourth;

        SingleLinkedList.display();

//        SingleLinkedList.insertFirstNode(12);
//
//        SingleLinkedList.insertLastNode(8);

//        SingleLinkedList.insertNodeAtPosition(4, 3);

//        SingleLinkedList.deleteFirstNode();

//        SingleLinkedList.deleteLastNode();

//        SingleLinkedList.deleteNodeAtPosition(3);

//        SingleLinkedList.searchElement(122);

//        SingleLinkedList.firstReverseLinkedList();

//        SingleLinkedList.secondReverseLinkedList();

//        SingleLinkedList.secondFindMiddleNode();

//        SingleLinkedList.findNTHElementFromEnd(2);

//        SingleLinkedList.deleteDuplicates();

        SingleLinkedList.insertNodeAtSortedLinkedList(5);









        /////////////////////////////////////////////////////////////////////////////////


    }
}
