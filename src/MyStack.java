import java.util.Stack;

/**
 * This class for implementing stack with two ways:
 *
 * @first: Single Linked List
 * @second: Array
 * @Third: Class only named stack and for solving ps
 */

//public class MyStack {
//
//    private int length;
//    private ListNode top;
//
//    private class ListNode{
//
//        private int data;
//        private ListNode next;
//
//        public ListNode(int data){
//            this.data = data;
//        }
//    }
//
//    public int getLength() { return length; }
//
//    public boolean isEmpty() { return length == 0; }
//
//    public void display(){
//
//        ListNode curr = top;
//        while (curr !=  null){
//            System.out.print(curr.data + "--> ");
//            curr = curr.next;
//        }
//        System.out.println(curr);
//        System.out.println("length: " + getLength());
//    }
//
//    public void push(int data){
//
//        ListNode temp = new ListNode(data);
//        temp.next = top;
//        top = temp;
//        length++;
//    }
//
//    public void pop() {
//
//        if (isEmpty()) throw new EmptyStackException();
//        top = top.next;
//        length--;
//    }
//}
//
//public class MyStack {
//
//    int[] stack;
//    int top;
//
//    public Stack (){
//        stack = new int[128];
//        top = 0;
//    }
//
//    public boolean isEmpty(){
//        return top == 0;
//    }
//
//    public void push(int value){
//
//        if (top == stack.length) return;
//
//        stack[top] = value;
//        top++;
//    }
//
//    public int pop(){
//
//        int returning = -1;
//        if (isEmpty()) return returning;
//
//        top--;
//        returning = stack[top];
//        return returning;
//    }
//
//    public void display(){
//
//        if (isEmpty()) return;
//
//        for (int i=top-1; i >= 0; i--){
//            System.out.println(stack[i]);
//        }
//        System.out.println("......");
//    }
//
//    public void clear(){
//        top = 0;
//    }
//
//    public void size(){
//        System.out.println("stack size: " + top);;
//    }
//}

public class MyStack {

    Stack<Character> stack = new Stack<>();

    public void display() {

        if (stack.isEmpty()) return;

        for (int i = stack.size(); i >= 0; i--) {
            System.out.println(stack.elementAt(i));
        }
        System.out.println("......");
    }

    public void reverseString(String str) {

        System.out.println("\n🔹 Reverse the string using a Stack...");

        char[] chars = str.toCharArray();

        for (char c : chars) {
            stack.push(c);
        }

        for (int i = 0; i < chars.length; i++) {
            chars[i] = stack.pop();
        }

        System.out.println("original: " + str + "\nreversed: " + new String(chars));
    }
}