import java.util.Scanner;

public class SquareCube{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

int square = number  * number ;

int cube = number  * number * number;

System.out.print("Square = " + square);

System.out.print("Cube= " + cube);

}

}
