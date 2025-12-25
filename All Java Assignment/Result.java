import java.util.Scanner;

public class Result{

public static void main(String... args){
Scanner input = new Scanner (System.in);

System.out.print("English SCore: "); 
int english = input.nextInt();

System.out.print("Maths SCore: "); 
int maths = input.nextInt();

System.out.print("Economics SCore: "); 
int economics = input.nextInt();

int total = english+maths+economics;

double average = total/3;

System.out.printf(" total is %d%n average is %f ", total, average);


}

}

