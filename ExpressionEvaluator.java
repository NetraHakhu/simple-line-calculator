//time complexity = o(n)
import java.util.*;

public class ExpressionEvaluator {

    private static final Map<String, Integer> PREC = new HashMap<>();
    private static final Set<String> RIGHT_ASSOC = new HashSet<>();

    static {
        PREC.put("^", 4);
        PREC.put("*", 3);
        PREC.put("/", 3);
        PREC.put("+", 2);
        PREC.put("-", 2);
        RIGHT_ASSOC.add("^");
    }

    public String evaluate(String expr) {
        List<String> tokens = tokenize(expr);
        List<String> postfix = infixToPostfix(tokens);
        return String.valueOf(evalPostfix(postfix));
    }

    private List<String> tokenize(String expr) {
        List<String> tokens = new ArrayList<>();
        StringBuilder number = new StringBuilder();
        for (char c : expr.toCharArray()) {
            if (Character.isDigit(c) || c == '.') number.append(c);
            else {
                if (number.length() > 0) {
                    tokens.add(number.toString());
                    number.setLength(0);
                }
                if (!Character.isWhitespace(c)) tokens.add(String.valueOf(c));
            }
        }
        if (number.length() > 0) tokens.add(number.toString());
        return tokens;
    }

    private List<String> infixToPostfix(List<String> tokens) {
        Deque<String> stack = new ArrayDeque<>();
        List<String> output = new ArrayList<>();

        for (String token : tokens) {
            if (isNumber(token)) output.add(token);
            else {
                while (!stack.isEmpty() &&
                        (PREC.getOrDefault(stack.peek(), 0) > PREC.getOrDefault(token, 0) ||
                                (PREC.getOrDefault(stack.peek(), 0) == PREC.getOrDefault(token, 0) && !RIGHT_ASSOC.contains(token)))) {
                    output.add(stack.pop());
                }
                stack.push(token);
            }
        }

        while (!stack.isEmpty()) output.add(stack.pop());
        return output;
    }

    private double evalPostfix(List<String> postfix) {
        Deque<Double> stack = new ArrayDeque<>();
        for (String token : postfix) {
            if (isNumber(token)) stack.push(Double.parseDouble(token));
            else {
                double b = stack.pop();
                double a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                    case "^": stack.push(Math.pow(a, b)); break;
                }
            }
        }
        return stack.pop();
    }

    private boolean isNumber(String s) {
        try { Double.parseDouble(s); return true; }
        catch (Exception e) { return false; }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpressionEvaluator evaluator = new ExpressionEvaluator();

        System.out.println("Expression Evaluator (Type 'exit' to quit)");

        while (true) {
            System.out.print("expr> ");
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) break;
            try { System.out.println("Result = " + evaluator.evaluate(input)); }
            catch (Exception e) { System.out.println("Invalid expression"); }
        }
        sc.close();
    }
}
