import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scannerObj = new Scanner(System.in)) {
            System.out.print("Enter annual interest rate, for example, 8.25: ");
            double annualInterestRate = scannerObj.nextDouble();

            System.out.print("Enter number of years as an integer: ");
            int numberOfYears = scannerObj.nextInt();

            System.out.print("Enter loan amount, for example, 120000.95: ");
            double loanAmount = scannerObj.nextDouble();

            Loan newLoan = new Loan(annualInterestRate, numberOfYears, loanAmount);
            String monthlyPayment = String.format("%.2f", newLoan.getMonthlyPayment());
            String totalPayment = String.format("%.2f", newLoan.getTotalPayment());
            System.out.println("The loan was created on " + newLoan.getLoanDate());
            System.out.println("The monthly payment is " + monthlyPayment);
            System.out.println("The total payment is " + totalPayment);
        }
    }
}
