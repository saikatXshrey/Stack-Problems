import java.util.*;

class Span {
    static void printSpan(int stock[]) {

        Stack<Integer> s = new Stack<>();
        s.push(0);
        System.out.print(1 + " ");

        for (int i = 1; i < stock.length; i++) {
            while (!s.isEmpty() && stock[s.peek()] <= stock[i])
                s.pop();

            int span = s.isEmpty() ? i + 1 : i - s.peek();
            System.out.print(span + " ");
            s.push(i);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 18, 12, 13, 14, 11, 16 };
        printSpan(arr);

    }
}