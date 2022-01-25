import java.util.Date;
import java.lang.Math;

public class Loan {
    private double annualInterestRate = 2.5;
    private int numberOfYears = 1;
    private double loanAmount = 1000;
    private Date loanDate = new Date();

    public Loan() {
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = (this.annualInterestRate / 100) / 12;
        double loanXmonthly = this.loanAmount * monthlyInterestRate;
        double numYearsX = this.numberOfYears * 12;
        double monthlyPayment = loanXmonthly / (1 - (1 / (Math.pow((1 + monthlyInterestRate), numYearsX))));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = this.getMonthlyPayment() * this.numberOfYears * 12;
        return totalPayment;
    }

}
