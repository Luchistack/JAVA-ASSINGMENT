import java.util.Scanner;

public class VowelConsonant{

    public static void countStrings(String word){

    int vowel = 0;    
    int consonant = 0;

    for(int count = 0; count < word.length(); count++){
//        for(int index = 0; index <= count; index ++){

            char letters = word.charAt(count);

            if(letters == 'a' || letters == 'e' || letters == 'i' || letters == 'o' || letters == 'u' || letters == 'A' || letters == 'E'|| letters == 'I'|| letters == 'O' || letters == 'U'){

                vowel ++;

            }else{
                   
                consonant ++;


            }           
  
        }
                  System.out.println("vowels are: " + vowel);
                  System.out.println("consonant are: " + consonant);
    }




public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a word: ");
String word = input.nextLine();




countStrings(word);




    }



}
