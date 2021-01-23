import java.util.*;

class Next {
    static ArrayList<Integer> nextGreater(int array[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(array[array.length - 1]);
        list.add(-1);

        for (int i = array.length - 2; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= array[i])
                s.pop();
            int res = s.isEmpty() ? -1 : s.peek();
            list.add(res);
            s.push(array[i]);
        }

        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 5, 15, 10, 8, 6, 12, 9, 18 };
        for (int i : nextGreater(array))
            System.out.print(i + " ");
    }
}