import java.util.Scanner;

public class Temperature{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Temperature of kelvin:");
double temperature = input.nextDouble();

double celslus = temperature - 273.25;

double fahrenhelt = (celslus * 1.8)+32;

System.out.printf("celslus is %f%n fahrenhelt is %f  ",  celslus, fahrenhelt);

}

}
