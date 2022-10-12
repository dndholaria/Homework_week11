import java.util.Scanner;

public class Student_Marksheet_01


{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Student Name

         System.out.println(" Enter student name " );
         String name = scanner.nextLine();

         //Roll Number
         System.out.println(" Enter Roll No " );
         int rollnumber = scanner.nextInt();

         //Marks

         System.out.println(" Enter mark of Maths " );
         int maths = scanner.nextInt();

         System.out.println(" Enter mark of Science " );
         int sci = scanner.nextInt();

         System.out.println(" Enter mark of English " );
         int eng = scanner.nextInt();

        //Total, Percentage and Result

        int total = maths + sci + eng;
        double percentage = total/3;
        String result = (percentage>=35)?("Pass") : ("Fail");


        System.out.println( name + " received total marks: "+total+ "; ");

        System.out.println( name + " received total Percentage:  " +percentage+ "; ");

        System.out.println(name + " you are " +result);

        //Grade

         if(percentage>=80)
        {System.out.println(name + "Congratulations you received grade A+ ;");}

        else if (percentage>=60)
         {System.out.println(name + " Congratulations you received grade A ;");}

        else if (percentage>= 50)
         {System.out.println( name + " Congratulations you received grade B ;");}

        else if (percentage>= 35)
         {System.out.println( name + " Congratulations you received grade C ;");}

         else
        {System.out.println("Unfortunately , You are failed so we cannot provide any grade.");}


    }
}
