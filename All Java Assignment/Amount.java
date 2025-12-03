import java.util.Scanner;

public class Amount{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter Principal amount:");
double amount = input.nextDouble();


System.out.print("rate:");
double rate = input.nextDouble();


System.out.print("Enter time in years:");
int time = input.nextInt();

double interest = (amount * rate * time)/100;

System.out.println("Interest =" + interest);


}


}


