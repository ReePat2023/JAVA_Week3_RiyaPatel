package JAVA_Week3;

import java.util.Arrays;

public class Program18valueofarray {

    public static void main(String[] args) {
        int[] num = {
                789, 19881, 8789, 782, 7884, 3214, 123, 456, 4567, 987};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Values of the array are : " + Arrays.toString(num));
        System.out.println("Sum of the array are : " + sum);
    }
}
