import java.util.Scanner;
public class wordmultiply{
    public static void main(String[] args){
Scanner input = new Scanner(System.in);

String newcount = " ";

System.out.println("Enter a word:");
String word = input.nextLine();

System.out.println("Enter a number: ");
int number = input.nextInt();

for(int index = 0; index < word.length(); index++){
    for(int count = 0; count < number; count++){
    newcount = newcount + word.charAt(index);

}

}

    System.out.print(newcount);
}
}

























//
//
//    String wordcount = " ";
//
//    System.out.print("Enter a word: ");
//    String word = input.nextLine();
//
//    System.out.print("Enter a number:");
//    int number = input.nextInt();
//
//
//
//    for (int index = 0; index < word.length(); index++){
//        for (int counter = 0; counter < number; counter++){
//             wordcount += word.charAt(index);
//    }
//}
//        System.out.println(wordcount);
//
//
//
//
//
//    }
//}
//
//
