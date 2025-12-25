import java.util.Scanner;
import java.util.Arrays;
public class CreditCardValidator{
public static void main (String[] args){
Scanner input = new Scanner(System.in);

//cardType
String [] creditCardType = {"VisaCard" , "MasterCard" , "DiscountCard" , "American ExpressCard"};
System.out.println("Enter CreditCard Type (0 for Visacard, 1 for MasterCard, 2 for DiscountCard, 3 for American ExpressCard): ");
int creditCard = input.nextInt();

if (creditCard == 0){
System.out.println(creditCardType[0]);
System.out.println("You''ve Selected  a VisaCard Type");
}else if (creditCard == 1){
System.out.println(creditCardType[1]);
System.out.println("You''ve Selected  a MasterCard Type");
}else if (creditCard == 2){
System.out.println(creditCardType[2]);
System.out.println("You''ve Selected  a DiscountCard Type");
}else if (creditCard == 3){
System.out.println(creditCardType[3]);
System.out.println("You''ve Selected  American ExpressCard ");

String cardNumber = " ";
//lenght
for (;;) {
        System.out.print("Enter CreditCard Number (13 - 16 digit): ");
        cardNumber = input.nextLine();

    if(cardNumber.lenght() < 13 || cardNumber.length() > 16) {
        System.out.println("Invalid Card lenght.");
    continue;
}
    if(!cardNUmber.matches("\\d+")) {
    System.out.println("Only digits are allowed.");
    continue;
}
    break;
}
    System.out.println("Valid account number", +cardNumber);
}
}


}
