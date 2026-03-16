import java.util.Scanner;
public class IsPrime{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.println("Enter a number: ");
int number = input.nextInt();


for(int index = 2; index <= number; index ++){
for(int count = 2; count <=index; count ++){


    if(index % count == 0){
    break;

   }
    else{

    System.out.println(index);

}

}


}





}



}
