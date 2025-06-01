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
//    public void displayStack(){
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
//    public void displayStack(){
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

    public void displayStack() {

        if (stack.isEmpty()) return;

        for (int i = stack.size(); i >= 0; i--) {
            System.out.println(stack.elementAt(i));
        }
        System.out.println("......");
    }

    public void reverseString(String str) {

        System.out.println("\n🔹 Reverse the string using a Stack...");
        Stack<Character> stack = new Stack<>();

        char[] chars = str.toCharArray();

        for (char c : chars) {
            stack.push(c);
        }

        for (int i = 0; i < chars.length; i++) {
            chars[i] = stack.pop();
        }

        System.out.println("original: " + str + "\nreversed: " + new String(chars));
    }

    public void displayArray(int[] arr) {

        if (arr == null) return;

        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }

    public void nextGreater() {

        System.out.println("\n🔹 Next Greater Element using a Stack...");

        Stack<Integer> stack = new Stack<>();
        final int[] nums = {4, 7, 3, 4, 8, 1};

        System.out.print("Input array: ");
        displayArray(nums);

        int n = nums.length;
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                    stack.pop();
                }
            }

            if (stack.isEmpty())
                res[i] = -1;
            else
                res[i] = stack.peek();

            stack.push(nums[i]);
        }

        System.out.print("Output array: ");
        displayArray(res);
    }

    public void validParentheses(String s) {

        System.out.println("\n🔹 Valid Parentheses or not a Stack...");

        for (char c : s.toCharArray()) {

            if (c == '{' || c == '(' || c == '[')
                stack.push(c);
            else {
                if (stack.isEmpty()) {
                    System.out.println("false");
                    return;
                } else {
                    if (stack.peek() == '{' && c == '}' ||
                            stack.peek() == '[' && c == ']' ||
                            stack.peek() == '(' && c == ')')
                        stack.pop();
                    else {
                        System.out.println("false");
                        return;
                    }

                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}