package JAVA_Week3;

import java.util.Scanner;

public class Program08inpputalphabet {

    public static void main(String[] args) {
        Scanner g1 = new Scanner(System.in);
        System.out.println("Please Enter Alphabet between A to F : ");
        char city = g1.next().charAt(0);
        Program08inpputalphabet cityName = new Program08inpputalphabet();
        cityName.printCityName(city);
        g1.close();
    }

    public void printCityName(char city){
        if (city == 'A' || city == 'a'){
            System.out.println("Atlanta");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Bombay");
        } else if (city == 'C' || city == 'c') {
            System.out.println("California");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Denmark");
        } else if (city == 'E' || city == 'e') {
            System.out.println("El Paso");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Franca");
        } else {
            System.out.println("The Alphabet you have entered is not between A to F ");
        }
    }

}
