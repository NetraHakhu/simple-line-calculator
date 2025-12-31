import java.util.*;
import java.time.LocalDateTime;

public class Calculator {

    private final ExpressionEvaluator evaluator = new ExpressionEvaluator();
    private final Scanner sc = new Scanner(System.in);
    private final List<HistoryEntry> history = new ArrayList<>();

    public void run() {
        System.out.println("Welcome to simple line command Calculator");

        while (true) {
            System.out.println("\nChoose option:");
            System.out.println("1. Basic Expression (+ - * / ^)");
            System.out.println("2. Statistics (mean, median, mode, %)");
            System.out.println("3. Advanced Math (sin, cos, tan, log, sqrt, factorial, exponent)");
            System.out.println("4. Show History");
            System.out.println("5. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter expression: ");
                    String expr = sc.nextLine();
                    String result = evaluator.evaluate(expr);
                    System.out.println("Result = " + result);
                    history.add(new HistoryEntry(LocalDateTime.now(), expr, result));
                    break;
                case 2:
                    StatisticsUtil.main(new String[]{});
                    break;
                case 3:
                    AdvancedMathUtil.main(new String[]{});
                    break;
                case 4:
                    System.out.println("History:");
                    if (history.isEmpty()) System.out.println("No entries yet");
                    for (HistoryEntry h : history) System.out.println(h);
                    break;
                case 5:
                    System.out.println("Exiting calculator. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.run();  // start the calculator
    }
}
