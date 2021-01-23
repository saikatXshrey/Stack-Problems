//implement 2 stack in an single array
class Stack {
    int[] arr;
    int top1;
    int top2;
    int cap;

    Stack(int cap) {
        this.cap = cap;
        top1 = -1;
        top2 = cap;
        arr = new int[cap];
    }

    void push1(int val) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = val;
        } else {
            System.out.println("Stack Overflow");
            return;
        }
    }

    void push2(int val) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = val;
        } else {
            System.out.println("Stack Overflow");
            return;
        }
    }

    int pop1() {
        if (top1 >= 0) {
            int res = arr[top1];
            top1--;
            return res;
        } else {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
    }

    int pop2() {
        if (top2 < cap) {
            int res = arr[top2];
            top2++;
            return res;
        } else {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
    }
}

class Driver {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push1(1);
        stack.push2(2);
        stack.push1(3);

        System.out.println(stack.pop2());
    }
}