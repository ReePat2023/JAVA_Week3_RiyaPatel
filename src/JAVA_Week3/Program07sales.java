package JAVA_Week3;

import java.util.Scanner;

public class Program07sales {

    public static void main(String[] args) {


        Scanner h1 = new Scanner(System.in);
        System.out.println("Enter Seller Name: ");
        String name = h1.nextLine();
        System.out.println("Enter Seller ID: ");
        int sellerID = h1.nextInt();
        System.out.println("Enter Sales Amount: ");
        int salesAmount = h1.nextInt();
        System.out.println("Enter Basic Salary: ");
        int basicSalary = h1.nextInt();

        Program07sales salesCommission = new Program07sales();
        int grossSalary = basicSalary + salesCommission.calculateCommission(salesAmount);
        System.out.println("Seller name is            : " + name);
        System.out.println("Seller id is              : " + sellerID );
        System.out.println("Seller's sales amount is  : " + salesAmount);
        System.out.println("Seller's basic salary is  : " + basicSalary);
        System.out.println("Seller's gross salary is  : " + grossSalary);

        h1.close();
    }

    public int calculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales Commission is " + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales Commission is " + commission);
        }
        return commission;
    }

}
