import java.util.Stack;

class getmin1 {
    Stack<Integer> os;
    Stack<Integer> as;

    getmin1() {
        os = new Stack<>();
        as = new Stack<>();
    }

    void push(int val) {
        if (os.isEmpty()) {
            os.add(val);
            as.add(val);
            return;
        }
        os.add(val);

        if (as.peek() >= os.peek())
            as.add(val);
    }

    void pop() {
        if (os.peek() == as.peek()) {
            as.pop();
        }
        os.pop();
    }

    int top() {
        return os.peek();
    }

    int getMin() {
        return as.peek();
    }

    public static void main(String[] args) {
        getmin1 s = new getmin1();

        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();

        System.out.print(" Minimum Element from Stack: " + s.getMin());
    }
}