import java.util.Scanner;

public class Greater{

public static void main(String... args){
Scanner input = new Scanner (System.in);

System.out.print("Enter First Number: "); 
double firstNumber = input.nextDouble();

System.out.print("Enter Second Number: "); 
double secondNumber = input.nextDouble();

if (firstNumber > secondNumber) {
System.out.printf("%f is greater than %f%n", firstNumber, secondNumber);
}
else{

System.out.printf("%f is greater than %f%n", secondNumber, firstNumber);

}

}

}




