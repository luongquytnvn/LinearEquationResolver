import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Vo so nghiem");
        } else {
            double c = (-b) / a;
            System.out.println("Phuong trinh co nghiem: x = "+c);
        }
    }
}
