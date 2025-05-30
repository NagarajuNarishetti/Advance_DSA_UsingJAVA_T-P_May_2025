import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        String str = "15,3,+,6,2,-,*";
        String[] tokens = str.split(",");

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumeric(token)) {
                // Push numbers onto the stack
                stack.push(Integer.parseInt(token));
            } else {
                // It's an operator: pop two elements and apply the operation
                int b = stack.pop(); // second operand
                int a = stack.pop(); // first operand
                int result = 0;

                switch (token) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                }

                stack.push(result); // Push the result back
            }
        }

        // Final result is at the top of the stack
        System.out.println("Result: " + stack.pop());
    }

    // Helper method to check if a string is a number
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
