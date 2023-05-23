package JAVA_Week3;

import java.util.Scanner;

public class Program09sitchstatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        String city = scanner.next().toUpperCase();

        Program09sitchstatement cityName = new Program09sitchstatement();
        cityName.printCityName(city);

        scanner.close();
    }

    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Atlanta");
                break;
            case "B":
                System.out.println("Benoni");
                break;
            case "C":
                System.out.println("California");
                break;
            case "D":
                System.out.println("Doha");
                break;
            case "E":
                System.out.println("El Paso");
                break;
            case "F":
                System.out.println("Franca");
                break;
            default:
                System.out.println("The Alphabet you have entered is not between A to F");
        }
    }
}
