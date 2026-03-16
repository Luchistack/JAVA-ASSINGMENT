import java.util.Scanner;
public class Financeapp{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.print("Enter the principlal amount: ");
double principalAmount = input.nextDouble();

System.out.print("Enter duration in years: ");
double yearlyDuration = input.nextDouble();


System.out.println("Interest Rate\t\t  Monthly Payment\t\tTotal Payment");

for(double rate = 5.0; rate <= 10.0; rate += 0.25){



double monthlyIntRate = rate / 100 / 12;

double noOfMonths = yearlyDuration * 12;


double monthlyPayment = (principalAmount * monthlyIntRate) / (1 - Math.pow(1 + monthlyIntRate, -noOfMonths)); 

double totalPayment = monthlyPayment * noOfMonths;



System.out.printf("%.2f \t\t ₦%.2f  \t\t₦%.2f⁪", rate, monthlyPayment, totalPayment);

System.out.println();
}
}

}
