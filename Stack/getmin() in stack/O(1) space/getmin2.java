import java.util.Stack;

class getter {
    Stack<Integer> s;
    int min;

    getter() {
        s = new Stack<>();
    }

    void push(int val) {
        if (s.isEmpty()) {
            min = val;
            s.add(val);
        } else if (val <= min) {
            s.add(2 * val - min);
            min = val;
        } else {
            s.add(val);
        }
    }

    void pop() {
        int top = s.peek();
        s.pop();
        if (top <= min) {
            min = 2 * min - top;
        }
    }

    int peek() {
        int top = s.peek();
        return ((top <= min) ? min : top);
    }

    int getMin() {
        return min;
    }

    public static void main(String[] args) {
        getter s = new getter();

        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();

        System.out.print(" Minimum Element from Stack: " + s.getMin());

    }
}