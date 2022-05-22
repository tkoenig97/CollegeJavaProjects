package MortgageCalculator;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
                System.out.print("Principal ($1K - $1M): ");
                principal = scanner.nextInt();
                if (principal >= 1_000 && principal <= 1_000_000) {
                    break;
                }
                System.out.println("Enter a value between 1,000 and 1,000,000");
        }


        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
                if (annualInterest >= 1 && annualInterest <= 30) {
                    monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;    
                    break;
                }
            System.out.println("Enter a value between 1 and 30");
        }
        
        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * 12;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = (double)principal * (double)monthlyInterest 
            * Math.pow((double)(1.0F + monthlyInterest), (double)numberOfPayments) 
            / (Math.pow((double)(1.0F + monthlyInterest), (double)numberOfPayments) - 1.0D);
            
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

        scanner.close();
    }
}