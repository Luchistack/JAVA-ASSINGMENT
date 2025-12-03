import java.util.Scanner;

public class Character{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a character: ");

char character = input.next().charAt(0);

int ascli = (int) character;

System.out.printf("Ascli is %d ",  ascli);

}

}


