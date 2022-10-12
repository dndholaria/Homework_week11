import java.util.Scanner;

public class Week_Name
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       // WAP input any number, the print Day name of the week accordingly

        System.out.println("Enter any number");
        int a = scanner.nextInt();

        switch (a)
        {case 1 : System.out.println("Day name of the week is Monday ");
            break;
        case 2 : System.out.println("Day name of the week is Tuesday ");
            break;
        case 3 : System.out.println("Day name of the week is Wednesday ");
            break;
        case 4 : System.out.println("Day name of the week is Thursday ");
            break;
        case 5 : System.out.println("Day name of the week is Friday ");
            break;
        case 6 : System.out.println("Day name of the week is Saturday ");
            break;
        case 7 : System.out.println("Day name of the week is Sunday ");
            break;

            default: System.out.println("Invalid entry");
            }
    }
}
