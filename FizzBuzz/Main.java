package FizzBuzz;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        String output = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        Boolean isDivisibleBy5 = number % 5 == 0;
        Boolean isDivisibleBy3 = number % 3 == 0;
        
        if (isDivisibleBy5)
            output = "Fizz";
        
        if (isDivisibleBy3)
            output += "Buzz";
        else
            output = Integer.toString(number);

        System.out.println(output);

        scanner.close();
    }

}
