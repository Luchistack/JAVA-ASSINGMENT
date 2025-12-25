import java.util.Scanner;
public class CheckOut{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int count = 0;


System.out.println("What is the customer's name ");
String name = input.nextLine();

String choice = "yes";
while(choice.equalsIgnoreCase("yes")) {

System.out.println("What did the user buy(Rice or parfait) ");
String buy = input.nextLine();

System.out.println("How many peices? ");
int pieces1 = input.nextInt();

System.out.println("How much per unit? ");
int amout = input.nextInt();

input.nextLine();

System.out.println("Add more items (Yes or No)? ");
choice = input.nextLine();


count++;

}

System.out.println("What is the your name? (Cashier) ");
String cashierName = input.nextLine();

System.out.println("How much discount will he get ");
int discount = input.nextInt();

//System.out.println("SEMICOLON STORES");
//System.out.println("MAIN BRANCH");
//System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
//System.out.println("TEL: 03293828343");
//System.out.println("Date: ");
//
//String sellerName = cashierName;
//System.out.printf("Cashier's Name: %s%n", sellerName);
//String customerName = name;
//System.out.printf("Customer Name: %s%n ", customerName);
//
//System.out.println("\n================================================");
//System.out.println("\t\tITEM\t QTY\t PRICE\t TOTAL(NGN)");
//System.out.println("----------------------------------------------------");
//
//String[] items = {"Parfait", "Rice"};
//int[] qty = {2, 2};
//double[] price = {2100.00, 550.00};
//
//for(int i = 0; i < items.length; i++) {
//double total = qty[i] * price[i];
//System.out.printf("\t\t%-10s %-5d %-10.2f  %-10.2f%n", items[i], qty[i], price[i], total);
//
//double discountRate = 0.08;
//double dicount = total * discountRate;
//double finalDiscount = total - discount;
//
//System.out.println("----------------------------------------------------");
//System.out.println("\t\t\t\tSubtotal:    5300.00");
//System.out.printf("\t\t\t\tDiscount     %.2f", finalDiscount);
//System.out.println("\n\t\t\t\tvat @ 17.50%: 927.50");
//
//System.out.println("\n====================================================");
//System.out.println("\n\tTHIS IS NOT A RECEIPT KINDLY PAY 5883.50");
//System.out.println("\n====================================================");
//}
//
//System.out.println("How much did the customer give you? ");
//int amoutpaid = input.nextInt();
//
//
//}
//}
//
//System.out.println("What is the your name? (Cashier) ");
//String cashierName = input.nextLine();
//
//System.out.println("How much discount will he get ");
//int discount = input.nextInt();
//
System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
System.out.println("TEL: 03293828343");
System.out.println("Date: ");

String sellerName = cashierName;
System.out.printf("Cashier's Name: %s%n", sellerName);
String customerName = name;
System.out.printf("Customer Name: %s%n ", customerName);

System.out.println("\n================================================");
System.out.println("\t\tITEM\t QTY\t PRICE\t TOTAL(NGN)");
System.out.println("----------------------------------------------------");

String[] items = {"Parfait", "Rice"};
int[] qty = {2, 2};
double[] price = {2100.00, 550.00};

for(int i = 0; i < items.length; i++) {
double total = qty[i] * price[i];
System.out.printf("\t\t%-10s %-5d %-10.2f  %-10.2f%n", items[i], qty[i], price[i], total);

System.out.println("----------------------------------------------------");
System.out.println("\t\t\t\tSubtotal:    5300.00");

double discountRate = 0.08;
double dicount = total * discountRate;
double finalDiscount = total - discount;
System.out.printf("\t\t\t\tDiscount     %.2f", finalDiscount);
System.out.println("\n\t\t\t\tvat @ 17.50%: 927.50");
System.out.println("====================================================");

double billTotal = 5803.00;
double amountPaid = 6800.00;
double balance = amountPaid - billTotal;

System.out.printf("\n\t\t\t\tBill total:  %.2f \n\t\t\t\tAmount Paid: %.2f \n\t\t\t\tBalance:     %.2f", billTotal, amountPaid, balance);
System.out.println("\n====================================================");
System.out.println("\n\tTHANK YOU FOR YOUR PATRONAGE");
System.out.println("\n====================================================");
}

}
}
