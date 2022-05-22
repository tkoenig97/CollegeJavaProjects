// This program asks the user for 6 integers and calculate the average.
import java.util.Scanner;
public class Average {

    public static void main(String[] args) {
        //Asks user for integers to average
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int integer_1 = kb.nextInt();

        System.out.print("Enter the second integer: ");
        int integer_2 = kb.nextInt();

        System.out.print("Enter the third integer: ");
        int integer_3 = kb.nextInt();

        System.out.print("Enter the fourth integer: ");
        int integer_4 = kb.nextInt();

        System.out.print("Enter the fifth integer: ");
        int integer_5 = kb.nextInt();

        System.out.print("Enter the sixth integer: ");
        int integer_6 = kb.nextInt();

        //Program calculates the average of the inputted integers
        int sum = integer_1 + integer_2 + integer_3 + integer_4 + integer_5 + integer_6;
        double average = sum/6;
        //Prints inputted integers
        System.out.println("Integers Inputted: ");
        System.out.println(integer_1 + ", " + integer_2 + ", " + integer_3 + ", " + integer_4 + ", " + integer_5 + ", " + integer_6);
        //Prints the average of the inputted integers
        System.out.println("Average: ");
        System.out.print(average);

        kb.close();
    }
}
