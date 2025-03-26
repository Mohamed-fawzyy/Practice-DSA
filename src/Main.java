
public class Main {
    public static void main(String[] args) {
        System.out.println("\n🚀 Welcome to Java DSA Practice!");

        // Single linked list
        System.out.println("\n🔹 Running Single linked list...");

        SingleLinkedList.head = new SingleLinkedList.ListNode(4);

        SingleLinkedList.ListNode second = new SingleLinkedList.ListNode(8);
        SingleLinkedList.ListNode third = new SingleLinkedList.ListNode(12);
        SingleLinkedList.ListNode fourth = new SingleLinkedList.ListNode(2);

        SingleLinkedList.head.next = second;
        second.next = third;
        third.next = fourth;

        SingleLinkedList.display();
//        SingleLinkedList.insertFirstNode(10);
//        SingleLinkedList.display();
//
//        SingleLinkedList.insertLastNode(9);
//        SingleLinkedList.display();

//        SingleLinkedList.insertNodeAtPosition(14, 3);
//        SingleLinkedList.display();

//        SingleLinkedList.deleteFirstNode();
//        SingleLinkedList.display();

//        SingleLinkedList.deleteLastNode();
//        SingleLinkedList.display();

//        SingleLinkedList.deleteNodeAtPosition(3);
//        SingleLinkedList.display();

//        SingleLinkedList.searchElement(122);

//        SingleLinkedList.firstReverseLinkedList();

//        SingleLinkedList.secondReverseLinkedList();

        SingleLinkedList.findMiddleNode();









        /////////////////////////////////////////////////////////////////////////////////


    }
}
