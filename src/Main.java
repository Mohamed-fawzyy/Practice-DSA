
public class Main {
    public static void main(String[] args) {
        System.out.println("\n🚀 Welcome to Java DSA Practice!");

        // Single linked list
//        System.out.println("\n🔹 Running Single linked list...");
//
//        SingleLinkedList.head = new SingleLinkedList.ListNode(5);

//        SingleLinkedList.ListNode second = new SingleLinkedList.ListNode(4);
//        SingleLinkedList.ListNode third = new SingleLinkedList.ListNode(3);
//        SingleLinkedList.ListNode fourth = new SingleLinkedList.ListNode(2);
//        SingleLinkedList.ListNode fifth = new SingleLinkedList.ListNode(1);
//
//        SingleLinkedList.head.next = second;
//        second.next = third;
//        third.next = fourth;
//        fourth.next = fifth;

//        SingleLinkedList.display();

//        SingleLinkedList.insertFirstNode(12);
//
//        SingleLinkedList.insertLastNode(8);

//        SingleLinkedList.insertNodeAtPosition(4, 3);

//        SingleLinkedList.deleteFirstNode();

//        SingleLinkedList.deleteLastNode();

//        SingleLinkedList.deleteNodeAtPosition(5);

//        SingleLinkedList.searchElement(122);

//        SingleLinkedList.firstReverseLinkedList();

//        SingleLinkedList.secondReverseLinkedList();

//        SingleLinkedList.secondFindMiddleNode();

//        SingleLinkedList.findNTHElementFromEnd(2);

//        SingleLinkedList.deleteDuplicates();

//        SingleLinkedList.insertNodeAtSortedLinkedList(5);

//        SingleLinkedList.findLoopInLinkedList();

//        SingleLinkedList.removeLoopLinkedList();

//        SingleLinkedList.generateLinkedList();

//        SingleLinkedList.mergeTwoSortedLinkedList();

//        SingleLinkedList.addTwoList();

//        SingleLinkedList.reorderList();

//        SingleLinkedList.ListNode sortedSLL = SingleLinkedList.mergeSort(SingleLinkedList.head);
//        SingleLinkedList.display(sortedSLL);

        /////////////////////////////////////////////////////////////////////////////////

        // Double linked list
//        System.out.println("\n🔹 Running Double linked list...");
//        System.out.println("\n🔹 Insert node at first for Double linked list...");

        DoubleLInkedList dll = new DoubleLInkedList();

//        dll.insertAtFirst(1);
//        dll.insertAtFirst(2);
//        dll.insertAtFirst(3);
//        dll.insertAtFirst(4);
//        dll.insertAtFirst(5);
//        dll.displayForward();

//        System.out.println("\n🔹 Insert node at first for Double linked list...");
//        dll.insertAtEnd(1);
//        dll.insertAtEnd(2);
//        dll.insertAtEnd(3);
//        dll.insertAtEnd(4);
//        dll.insertAtEnd(5);
//        dll.displayForward();

//        dll.deleteFirstNode();

//        dll.deleteLastNode();
//        dll.displayForward();

        /////////////////////////////////////////////////////////////////////////////////

        System.out.println("\n🔹 Running Circular Single Linked List...");
        CircularSingleLinkedList csll = new CircularSingleLinkedList();
        csll.createCircular();

//        csll.insertNodeAtFirst(4);
//        csll.insertNodeAtFirst(3);
//        csll.insertNodeAtFirst(2);
//        csll.insertNodeAtFirst(1);

//        csll.insertNodeAtEnd(1);
//        csll.insertNodeAtEnd(2);
//        csll.insertNodeAtEnd(3);
//        csll.insertNodeAtEnd(4);

//        csll.removeFirstNode();

        csll.removeLastNode();
        csll.display();


        /////////////////////////////////////////////////////////////////////////////////

        // Merge Sort with array
//        System.out.println("\n🔹 Running Merge Sort Array...");
//        MergeSort.createArray(10);
//
//        MergeSort.mergeSort(MergeSort.arr);
//        MergeSort.display(MergeSort.arr);
    }
}
