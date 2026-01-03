
//Ask user to select an option, Deposit, Withdrawal, Show transaction or Exit using Array or loop, 
//Enter choice:
//Enter deposit amount:
//Depoited:                     | New Balance:

//if deposit is selected, Ask the user how much does the user wants to deposit
//add the deposit to the previous account balace,  Deposited: N{amount} | New Balace: {account balance}
//display the updated account balace

import java.util.Scanner;
public class TransactionLog{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.println("Welcome to Transaction Log app");
System.out.println(" \n 1. Deposit\n 2. Withdraw\n 3. Show Transactions\n 4. Exit");

int total = 0;
int count = 0;
int newBalance = 0;
int withdraw = 0;
int deposit = 0; 

do{System.out.print("\nEnter your choice: ");
     int choice = input.nextInt();
       count++;

    if(choice == 1) {
    System.out.print("Enter deposit amount: ₦ ");
     deposit = input.nextInt();
    total = deposit + total;
    System.out.printf("Deposited:₦%d | New Balance:₦%d\n", deposit, total);
    System.out.println("\n===================================");
     
}
    if(choice == 2) {
    System.out.print("\nEnter withdrawal amount: ₦ ");
     withdraw = input.nextInt();
      newBalance = total - withdraw;
    System.out.printf("Withdrew:₦%d | New Balance:₦%d\n", withdraw, newBalance);
    System.out.println("\n===================================");

}

   if(choice == 3) {
    System.out.print("\nTransaction so far: ");
   System.out.printf("\n1. Deposited:₦%d | New Balance:₦%d\n", deposit, total);
   System.out.printf("2. Withdrew:₦%d | New Balance:₦%d\n", withdraw, newBalance);
System.out.println("\n===================================");

}
    if(choice == 4) {
    System.out.printf(" Final balance:₦%d\n ", newBalance);
    System.out.println("Thank you for using Transactional Log App!");

}
else if(choice != 1 && choice !=2 && choice !=3 && choice != 4){
    System.out.println("Invalid input");
    break;
}
}
    while(count<=3);

}
}
