import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class fifthSem {
    public static void main(String[] args) {
        System.out.println(isValidBrackets("")); // true
        System.out.println(isValidBrackets("(abc)")); //true
        System.out.println(isValidBrackets("((]")); //false
        System.out.println(isValidBrackets("]")); //false
        System.out.println(isValidBrackets("[]{}((<>))"));//true
    }
    private static boolean isValidBrackets(String input) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        brackets.put('>', '<');
        Deque<Character> stack = new LinkedList<>();
            for (char c : input.toCharArray()) {
                if (brackets.containsValue(c)) {
                    stack.push(c);
                } else if (brackets.containsKey(c)) {
                    if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                        return false;
                    }
                }
            }
        return stack.isEmpty();   
    }
}

