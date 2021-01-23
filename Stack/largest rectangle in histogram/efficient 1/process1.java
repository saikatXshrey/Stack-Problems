import java.util.Stack;

class LargestRect {
    static int MaxArea(int array[]) {
        // array which will contain index of previous smaller of the current element
        int[] ps = new int[array.length];
        // array which will contain index of next smaller of the current element
        int[] ns = new int[array.length];

        Stack<Integer> s = new Stack<>();
        int res = 0;

        // getting the previous smaller and storing the index
        s.push(0);
        for (int i = 0; i < array.length; i++) {
            while (!s.isEmpty() && array[s.peek()] >= array[i]) {
                s.pop();
            }
            int ret = s.isEmpty() ? -1 : s.peek();
            ps[i] = ret;
            s.push(i);
        }

        // Empty the stack
        while (!s.isEmpty())
            s.pop();

        // getting the next smaller and storing the index
        s.push(array.length - 1);
        for (int i = array.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && array[s.peek()] >= array[i]) {
                s.pop();
            }
            int ret = s.isEmpty() ? array.length : s.peek();
            ns[i] = ret;
            s.push(i);
        }

        // calculating the max area
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            current += (i - ps[i] - 1) * array[i];
            current += (ns[i] - i - 1) * array[i];
            res = Math.max(res, current);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 6, 2, 5, 4, 1, 5, 6 };
        System.out.println(MaxArea(array));
    }
}