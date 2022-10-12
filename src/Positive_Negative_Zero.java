import java.util.Scanner;

public class Positive_Negative_Zero
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter any digit here to check its Positive, Negative or Zero");
        int a = scanner.nextInt();

        if(a==0)
        {
            System.out.println("Entered number is Zero.");
        }
        else if (a>0)
        {
            System.out.println("Entered number " +a + " is Positive value.");
        }
        else if (a<0)
        {
            System.out.println( "Entered number " +a + " is Negative value. ");
        }
    }
}
