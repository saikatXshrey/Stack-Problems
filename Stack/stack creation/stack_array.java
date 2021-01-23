//Stack creation with array
class my_Stack {
    int[] stackArr;
    int top;
    int cap;

    my_Stack(int cap) {
        top = -1;
        this.cap = cap;
        stackArr = new int[cap];
    }

    void push(int val) {
        if (top == cap - 1) {
            System.out.println("Stack is Full");
            return;
        }
        top++;
        stackArr[top] = val;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        int res = stackArr[top];
        top--;
        return res;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        return stackArr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return cap + 1;
    }
}

class Driver {
    public static void main(String[] args) {
        my_Stack stack = new my_Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
