import java.util.Scanner;
public class mortgageClculator{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the principlal amount: ");
int principalAmount = input.nextInt();
System.out.print("Enter the annual interest rate: ");
double annualRate = input.nextDouble();
System.out.print("Enter duration in years: ");
int yearlyDuration = input.nextInt();

double mRate = annualRate / 12;
int months = yearlyDuration * 12;

double power = Math.pow(1 + mRate, months);
double monthlyPayment = principalAmount * (mRate * power) / (power - 1);

System.out.printf("Your monthly payment is $%.2f%n", monthlyPayment);

}
}


