import java.util.EmptyStackException;

public class Stack {

    private int length;
    private ListNode top;

    private class ListNode{

        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public int getLength() { return length; }
    public boolean isEmpty() { return length == 0; }
    public void display(){

        ListNode curr = top;
        while (curr !=  null){
            System.out.print(curr.data + "--> ");
            curr = curr.next;
        }
        System.out.println(curr);
        System.out.println("length: " + getLength());
    }

    public void push(int data){

        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public void pop() {

        if (isEmpty()) throw new EmptyStackException();
        top = top.next;
        length--;
    }
}
