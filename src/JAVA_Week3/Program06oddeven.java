package JAVA_Week3;

import java.util.Scanner;

public class Program06oddeven {

    public static void main(String[] args) {

        Scanner c1 = new Scanner(System.in);
        System.out.println("Enter the value to check ODD or EVEN number : ");
        int number = c1.nextInt();
        Program06oddeven oddEven = new Program06oddeven();
        System.out.println(number + " is " + oddEven.isItEvenorOddNumber(number) + " number ");
        c1.close();
    }

    public String isItEvenorOddNumber(int number){
        if (number % 2 == 0) {
            return "Even";
        }else {
            return "Odd";
        }
    }
}

