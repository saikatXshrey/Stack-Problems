import java.util.*;

class rect_1 {

    static int largestHistogram(int[] array) {
        int res = 0;
        int top = 0;
        int current = 0;

        ArrayDeque<Integer> s = new ArrayDeque<>();

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

    static int rectArea(int[][] matrix, int r, int c) {
        int res = largestHistogram(matrix[0]);

        for (int i = 1; i < r; i++) {
            for (int k = 0; k < c; k++) {
                if (matrix[i][k] == 1)
                    matrix[i][k] += matrix[i - 1][k];
            }
            res = Math.max(res, largestHistogram(matrix[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        int r = 4;
        int c = 4;

        int[][] matrix = { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };
        System.out.print("Area of maximum rectangle is " + rectArea(matrix, r, c));
    }
}