import java.util.Scanner;

public class Vote_Criteria
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Age");
        int Age = scanner.nextInt();

        if(Age>=18)
        {
            System.out.printf(" This person is " +Age+ " Years old and therefore Eligible for vote");
        }
        else if ((Age==0) && (Age <18))
        {
            System.out.println(" This person is under 18 and therefore not eligible for vote");
        }
        else
        {
            System.out.println("Invalid Entry");
        }

    }


}
