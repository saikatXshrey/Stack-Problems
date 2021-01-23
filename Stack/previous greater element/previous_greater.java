import java.util.Stack;

class Previous {
    static void pre(int array[]) {
        Stack<Integer> s = new Stack<>();

        s.push(array[0]);
        System.out.print(-1 + " ");

        for (int i = 1; i < array.length; i++) {
            while (!s.isEmpty() && s.peek() <= array[i]) {
                s.pop();
            }
            int res = s.isEmpty() ? -1 : s.peek();
            System.out.print(res + " ");
            s.push(array[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 18, 12, 13, 14, 11, 16 };
        pre(arr);

    }
}