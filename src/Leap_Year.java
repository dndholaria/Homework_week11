import java.util.Scanner;

public class Leap_Year

{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //Scanner
        System.out.println("Enter Year");
        int year = scanner.nextInt();

        if(year%4==0)   // if else
        {System.out.println(" Leap Year");}
        else
        {System.out.println("NOT Leap Year");}
    }

    }

