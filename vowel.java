import java.util.Scanner;
public class vowel{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


int vowel = 0;
int consonant = 0;

System.out.println("Enter a string: ");
String letter = input.nextLine().trim();

for(int index = 0; index < letter.length(); index ++){

char alphabeth = letter.charAt(index);



if(alphabeth == 'a' || alphabeth == 'e' || alphabeth == 'i' || alphabeth == 'o' || alphabeth == 'u' || alphabeth == 'A' || alphabeth == 'E' || alphabeth == 'I' || alphabeth == 'O' || alphabeth == 'U' ){

vowel++;

}
else{
consonant++;


}
}
System.out.println("The number of vowel = " + vowel + " ");

System.out.println("The number of consonant = " + consonant + " ");
//




}


} 
