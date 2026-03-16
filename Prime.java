import java.util.Scanner;
public class Prime{
public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a number: ");
int prime = input.nextInt();
 

int counter = 0;

int divisor = 2;

for(int count = divisor; count < prime; count ++){

if(prime % count == 0){

counter ++;
}
}

if(counter == 0 && prime > 1){

System.out.println(prime + " Is prime number");
}else{ 
System.out.println(prime + " is not a prime number");
    
}


    }
}


