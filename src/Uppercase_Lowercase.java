import java.util.Scanner;

public class Uppercase_Lowercase
{
    public static void main(String[] args)
    {

        //Input any alphabet in uppercase and print it in lowercase

        Scanner scanner = new Scanner(System.in);

        char ch;
        int temp;

        System.out.println("Enter character in upper case");
        ch = scanner.next().charAt(0);

        temp = (int) ch;
        temp = temp + 32;
        ch = (char) temp;

        System.out.println("Lower case is: " +ch);
    }

}
