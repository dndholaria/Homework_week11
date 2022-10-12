import java.util.Scanner;

public class Find_Number_Aphaber_Symbol
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter any value and the find out if it is number (0-9) or an alphabet or symbol

        System.out.println("Enter any value");

        char ch =scanner.next().charAt(0);

        if((ch>='a') && (ch<='z')){

            System.out.println(ch +" - is alphabet");

        } else if ((ch>='A') && (ch<='Z')){

            System.out.println(ch +" - is alphabet");
        }  else if ((ch>='0') && (ch<='9')){

            System.out.println(ch +" - is number");

        }else {
            System.out.println(ch + " - is symbol");
        }
    }
}
