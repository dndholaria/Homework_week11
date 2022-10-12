import java.util.Scanner;

public class Calculation_1
{
    public static void main(String[] args) {

        // WAP to input enter any two number and ask user to enter their symbol (+, -, /, *)
        // find addition, subtraction, multiplication and division according to their symbol

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();

        System.out.println("1. Addition       2. Subtraction     3. Multiplication    4. Division. ");
        System.out.println("\nEnter option 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division");
        int option = scanner.nextInt();

        switch (option)

        {   case 1 : System.out.println("Addition: " +(a+b));
                        break;

            case 2: System.out.println("Subtraction: " + (a-b));
                         break;

            case 3 : System.out.println("Multiplication: " +(a*b));
                         break;

            case 4: System.out.println("Division: " + (a/b));
                          break;

            default:
                System.out.println("Invalid entry");

        }
    }
}
