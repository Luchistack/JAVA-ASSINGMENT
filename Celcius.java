
import java.util.Scanner;
public class Celcius{


     public static void celcius(double number){

     for(int count = 0; count < number; count ++){
    
     number = (number * 9/5) + 32;

     System.out.println("celcius number is ----> " + number);

   }

}





    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: ");
    double number = input.nextInt();


    celcius(number);



    }


}



