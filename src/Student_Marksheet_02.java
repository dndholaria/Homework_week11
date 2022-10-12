import java.util.Scanner;

public class Student_Marksheet_02
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //STUDENT NAME

        System.out.println(" Please Enter Student name ");
        String name = scanner.nextLine();

        System.out.println( "Please Enter Roll No ");
        int rollNumber = scanner.nextInt();

        //MARKS

        System.out.println("Please Enter Maths Mark");
        int maths = scanner.nextInt();

        System.out.println("Please Enter English Mark");
        int eng = scanner.nextInt();

        System.out.println("Please Enter Science Mark");
        int sci = scanner.nextInt();

        System.out.println("Please Enter Geology Mark");
        int geo = scanner.nextInt();

        //TOTAL

        double total = maths + eng + sci + geo;
        System.out.println(name + " your total marks is: " +total   );

        double percentage = total/4;
        System.out.println(name + " your percentage is: " + percentage);

        //PASS FAIL

        if
        ((maths>=35) && (sci>=35) && (eng>=35) && (geo>=35) )

                {
                    System.out.println("You are pass as your received required marks in each subject");;
                }

        else {

            System.out.println("You are fail as you have not received required mark in one or more subjects");;

             }


    }
}
