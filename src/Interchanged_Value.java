import java.util.Scanner;

public class Interchanged_Value
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a");
        int a = scanner.nextInt();

        System.out.println("Enter b");
        int b = scanner.nextInt();

        //EQUATION

        a= a+b;
        b= a-b;
        a= a-b;

        System.out.println(" Now value of a is = " +a);
        System.out.println(" Now value of b is = " +b);

    }
}
