package JAVA_Week3;

import java.util.Scanner;

public class Program12valueofalphabet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);

        Program12valueofalphabet inputValue = new Program12valueofalphabet();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);

        scanner.close();
    }

    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Number.");
        } else {
            System.out.println(ch + " is a Symbol.");
        }
    }

}
