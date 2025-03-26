<<<<<<< HEAD
import java.util.Scanner;
import java.util.ArrayList;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Map.Entry<String, Double>> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;

        while (repeat) {
            System.out.println("What is the first number ? [x] ");
            double x = scanner.nextDouble();

            System.out.println("What is the second number ? [y] ");
            double y = scanner.nextDouble();

            scanner.nextLine();

            System.out.println("What is the operation ? [+] [-] [*] [/] [y√x(r)] [x^y(p)] ");
            String o = scanner.nextLine();

            double result = 0;

            switch (o) {
                case "+":
                    result = add(x, y);
                    break;
                case "-":
                    result = sub(x, y);
                    break;
                case "*":
                    result = mul(x, y);
                    break;
                case "/":
                    result = div(x, y);
                    break;
                case "r":
                    result = roo(x, y);
                    break;
                case "p":
                    result = pow(x, y);
                    break;
                default:
                    System.out.println("Invalid operation!");
                    continue;
            }

            String operation = String.valueOf(x) + " " + o + " " + String.valueOf(y) + " = " + result;
            list.add(new SimpleEntry<>(operation, result));

            System.out.println("Do you want to impress all operation history? [y] [n] ");
            String h = scanner.nextLine();

            if (h.equals("y")) {
                System.out.println("Operation History:");
                for (Map.Entry<String, Double> entry : list) {
                    System.out.println(entry.getKey() + " Result: " + entry.getValue());
                }
            }

            System.out.println("Do you want to repeat? [y] [n] ");
            String r = scanner.nextLine();

            if (r.equals("n")) {
                repeat = false;
            }
        }

        scanner.close();
    }

    public static double add(double a, double b) {
        double result = a + b;
        System.out.println("Result is: " + result);
        return result;
    }

    public static double sub(double a, double b) {
        double result = a - b;
        System.out.println("Result is: " + result);
        return result;
    }

    public static double mul(double a, double b) {
        double result = a * b;
        System.out.println("Result is: " + result);
        return result;
    }

    public static double div(double a, double b) {
        if (b != 0) {
            double result = a / b;
            System.out.println("Result is: " + result);
            return result;
        } else {
            System.out.println("Error: Division by zero!");
            return 0;
        }
    }

    public static double roo(double a, double b) {
        if (a >= 0 && b > 0) {
            double result = Math.pow(a, 1.0 / b);
            System.out.println("Result is: " + result);
            return result;
        } else {
            System.out.println("Error: Invalid input for root calculation!");
            return 0;
        }
    }

    public static double pow(double a, double b) {
        double result = Math.pow(a, b);
        System.out.println("Result is: " + result);
        return result;
    }
}