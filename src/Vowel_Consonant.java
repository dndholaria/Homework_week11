import java.util.Scanner;

public class Vowel_Consonant
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Print Vowel or Consonant, depending on the user input
        System.out.println("Enter any character from alphabet");
        char ch = scanner.next().charAt(0);

        switch (ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.printf("Entered character is VOWEL");
                break;
            default:
                System.out.println("Entered character is CONSONANT");

        }
    }


}
