import java.util.Scanner;

public class Sales_Commission
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Sales ID");
        String salesID = scanner.nextLine();

        System.out.println("Enter Seller's name");
        String SellerName = scanner.nextLine();

        System.out.println("Enter Basic Salary");
        int basicsalary = scanner.nextInt();

        System.out.println("Enter Sales Amount");
        double salesamount = scanner.nextInt();

        //calculate commission

        if(salesamount>=50000){
            System.out.println("Commission is " + ((salesamount*35/100)));
        }
        else if (salesamount>=30000 && salesamount<50000){
            System.out.println("Commission is " +((salesamount*20)/100));
        }
        else if (salesamount>=20000 && salesamount<30000) {
            System.out.println("Commission is " + ((salesamount * 10) / 100));
        }
        else if (salesamount>=10000 && salesamount<20000){
            System.out.println("Commision is " +((salesamount*5)/100));}

        else if (salesamount <10000 && salesamount >0){
            System.out.println("Commision is " +((salesamount*2)/100));}

        else {
            System.out.println("Invalid entry");}


    }
}
