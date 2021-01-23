import java.util.Stack;

class LargestRest2 {
    static int AreaMax(int array[]) {
        int res = 0;
        int top;
        int current;
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < array.length; i++) {
            while (!s.isEmpty() && array[s.peek()] >= array[i]) {
                top = s.peek();
                s.pop();
                current = array[top] * (s.isEmpty() ? i : i - s.peek() - 1);
                res = Math.max(res, current);
            }
            s.push(i);
        }

        while (!s.isEmpty()) {
            top = s.peek();
            s.pop();
            current = array[top] * (s.isEmpty() ? array.length : array.length - s.peek() - 1);
            res = Math.max(res, current);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 6, 2, 5, 4, 1, 5, 6 };
        System.out.print(AreaMax(array));
    }
}