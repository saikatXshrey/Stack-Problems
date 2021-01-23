//stack using 
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class stack_linkedlist {
    Node head;
    int top = -1;

    void push(Node node) {
        node.next = head;
        head = node;
        top++;
    }

    int pop(Node list) {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        int res = list.data;
        head = list.next;
        list.next = null;
        top--;
        return res;
    }

    int peek(Node list) {
        return list.data;
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        stack_linkedlist stack = new stack_linkedlist();

        stack.push(new Node(1));
        stack.push(new Node(2));
        stack.push(new Node(3));

        System.out.println(stack.peek(stack.head));
        System.out.println(stack.size());
        System.out.println(stack.pop(stack.head));
        System.out.println(stack.peek(stack.head));
        System.out.println(stack.size());
        System.out.println(stack.pop(stack.head));
        System.out.println(stack.peek(stack.head));
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
