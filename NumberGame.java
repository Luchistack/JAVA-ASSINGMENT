import java.util.Scanner;
public class NumberGame{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

System.out.println("WELCOME TO NUMBER GAME CHALLENGE");
//
int secretCode = 10;

for(int index = 0; index <= 100; index++){



System.out.println("Guess a number or press 0 to quit🤔️");
int number = input.nextInt();





if(number == 0){
System.out.println("Thanks for trying");
break;

}


if(number < 10){
System.out.println("Number is lower than secrect number, Guess again🫣️: ");
}

if(number > 10){
System.out.println("Number is higher than secrect number, Guess again🫣️: ");
}


if(number == 10){
System.out.println("Congrats, you guessed right💪️");
break;

//}else{
//System.out.println("Invalid entry, try again");
//break;
//

}

//
}


    }

}
