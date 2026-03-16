import random;
import java.util.Scanner;
public class generate{
public static void main(String[] args){
Scanner input = new Scanner(System.in);



System.out.println("Guess number");
int number = input.nextInt();

int guess = random.randint(1, 10);

System.out.print("You Guess: " + number);
System.out.print("Correct Number is: {guess}");






}
}
