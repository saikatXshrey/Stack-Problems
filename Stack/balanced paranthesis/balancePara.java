//chack if the set of paranthesis is balanced or not

import java.util.ArrayDeque;

class Balance {
    static boolean checker(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else if (stack.isEmpty() == true)
                return false;
            else if (mark(stack.peek(), s.charAt(i)) == false)
                return false;
            else
                stack.pop();
        }
        return (stack.isEmpty() == true);
    }

    static boolean mark(char a, char b) {
        if ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'))
            return true;
        return false;
    }

    public static void main(String[] args) {

        String str = "{(}[])";

        if (checker(str))
            System.out.print("Balanced");
        else
            System.out.print("Not Balanced");

    }
}