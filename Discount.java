import java.util.Scanner;
public class Discount{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter name of item: ");
String item = input.nextLine();

System.out.println("Enter promotional code in CAPITAL LETTER: ");
int code = input.nextInt();

System.out.println("Enter price of item: ");
int price = input.nextInt();

int discount_one= price - 10;
int discount_two = price / 2;


if(code == 1234){
    System.out.printf("You have recieved discount");
    
}


}
}

//String save10 = code;
//String halfoff = code;
//
//while(code == save10) {
//        System.out.println("You've recieved 10% discount");
//}
//        System.out.print("Your payment is: ", discount_one);            
//if (code == halfoff) {
//        System.out.print("You've receieved 50% discount");
//        System.out.print("Your discount payment is: ", discount_two);
//}else
//        System.out.println("No discount");
//
//}
//}
