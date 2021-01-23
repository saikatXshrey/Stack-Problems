
//stack using ArrayList
import java.util.ArrayList;

class stack_arraylist {
    ArrayList<Integer> list = new ArrayList<>();

    void push(int val) {
        list.add(val);
    }

    int pop() {
        int res = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return res;
    }

    int peek() {
        return list.get(list.size() - 1);
    }

    int size() {
        return list.size();
    }

    boolean isEmpty() {
        return list.isEmpty();
    }
}

class Driver2 {
    public static void main(String[] args) {
        stack_arraylist stk = new stack_arraylist();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.peek());
    }
}
