import java.util.Scanner;

public class Odd_Even
{
    public static void main(String[] args)
    {

         Scanner scanner = new Scanner(System.in); // Scanner

         System.out.println("Please enter number");

         int num = scanner.nextInt();

         String result = (num%2==0)? ("Even") : ("Odd");

         System.out.println(" Your enter number " +num+ " is: " +result);
    }
}
