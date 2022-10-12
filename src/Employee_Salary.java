import java.util.Scanner;

public class Employee_Salary
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   //Scanner

        System.out.println("Enter basic salary");
        int basicsalary = scanner.nextInt();

        int HRA = ((basicsalary*10)/100);
        System.out.println("HRA = " +HRA);

        int DA = ((basicsalary*8)/100);
        System.out.println("DA = " +DA);

        int TA = ((basicsalary*9)/100);
        System.out.println("TA = " + TA);

        int PF = ((basicsalary*20)/100);
        System.out.println("PF = " + PF);

        //Gross salary

        int grosssalary = basicsalary + HRA + DA+ TA+ PF;
        System.out.println("Gross Salary = " + grosssalary);




    }
}
