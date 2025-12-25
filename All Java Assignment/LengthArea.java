import java.util.Scanner;

public class LengthArea{

public static void main(String... args){
Scanner input = new Scanner (System.in);

System.out.print("Enter lenght: "); 
double length= input.nextDouble();

System.out.print("Enter weight: "); 
double weight= input.nextDouble();

double area = length * weight;

System.out.print("Area of rectangle: " + area);

}

}
