import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class City_Name
{
    public static void main(String[] args)
    {


        Scanner scanner = new Scanner(System.in);   //SCANNER


        System.out.println("Enter Alphabet");

        char ch = scanner.next().charAt(0);

        switch (ch) {
            case 'a':
                System.out.println(" City name : Ahmedabad ");
                break;
            case 'b':
                System.out.println(" City name : Baroda ");
                break;
            case 'c':
                System.out.println(" City name : Chile ");
                break;
            case 'd':
                System.out.println(" City name : Dorset ");
                break;
            case 'e':
                System.out.println(" City name : Emlabad ");
                break;
            case 'f':
                System.out.println(" City name : Faridabad ");
                break;
            default:
                System.out.println("Invalid Entry");

        }
    }}