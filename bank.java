import java.util.Scanner;
public class bank{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

System.out.println("WELCOME TO MONIEPOINT");

int currentBalance = 1000;
int totalCurrentBalance = 0;
int totalWithdrawBalance = 0;
int totalBalance = 0;
int twb = 0;

System.out.println("Your current balance = " + currentBalance);



for(int count = 0; count <= 10; count ++){
System.out.println("Select Transaction type\n 1. Deposit\n 2. Withdraw\n 3. Check Balance:");
int transaction = input.nextInt();


if(transaction == 1){
System.out.print("Enter amount to deposit: ");
int deposit = input.nextInt();

totalCurrentBalance = currentBalance +   deposit;

totalBalance += totalCurrentBalance;

System.out.println("Recently deposited is " + deposit);

System.out.println("Current balance is " + totalBalance);

System.out.println("Thanks for banking with us");

}

if(transaction == 2){
System.out.print("Enter amount to withdraw: ");
int withdraw = input.nextInt();


totalWithdrawBalance = currentBalance - withdraw;

twb -= totalWithdrawBalance;

System.out.println("Recently withdrawned is " + withdraw);

System.out.println("Current balance is " + twb);

System.out.println("Thanks for banking with us");

}

if(transaction == 3){


int totalBalance = totalWithdrawBalance;


System.out.println("Current balance is " + totalBalance);

System.out.println("Thanks for banking with us");
break;

}




}



    }

}
