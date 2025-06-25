import java.util.Scanner;

public class Problem1 {
    double a;
    double b;
    String operation;

    public Problem1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public double calculate() {
        if (operation.equals("add")) {
            return a + b;
        } else if (operation.equals("sub")) {
            return a - b;
        } else if (operation.equals("mul")) {
            return a * b;
        } else if (operation.equals("div")) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Division by zero is not allowed.");
                return 0;
            }
        } else {
            System.out.println("Invalid operation.");
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        sc.nextLine();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.nextLine();

        Problem1 calc = new Problem1(a, b, operation);
        double result = calc.calculate();
        System.out.println("Result: " + result);

        sc.close();
    }
}
