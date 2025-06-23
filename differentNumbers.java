// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.*;

class differentNumbers {
    public static void main(String[] args) {
        int positive = 0, negative = 0, zero = 0;
        System.out.println("type 1 for input or 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input == 1) {
            System.out.print("Enter the value: ");
            int value = sc.nextInt();

            if (value > 0) {
                positive++;

            } else if (value < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.println("type 1 for input or 0 to stop");
            input = sc.nextInt();
        }

        System.out.println("positives: " + positive);
        System.out.println("Negatives: " + negative);
        System.out.println("Zeros: " + zero);

        sc.close();

    }
}
