import java.util.Scanner;

public class Miles{

public static void main(String[] args){
Scanner input = new Scanner (System.in);

System.out.print("enter distance of km: ");
double km = input.nextDouble();


double miles = km * 0.621371;

System.out.println("distance in miles: " + miles);

}

}
