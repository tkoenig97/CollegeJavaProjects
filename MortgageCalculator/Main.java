package MortgageCalculator;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        byte monthsInYear = 12;
        byte percent = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");

        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / 100.0F / 12.0F;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * 12;

        double mortgage = (double)principal * (double)monthlyInterest 
            * Math.pow((double)(1.0F + monthlyInterest), (double)numberOfPayments) 
            / (Math.pow((double)(1.0F + monthlyInterest), (double)numberOfPayments) - 1.0D);
            
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}