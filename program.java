//write a program that collects an array of numbers abd gives me the the second largest number
//in a function working code, when tested, i can test with either decimal numbers or intergers


//initialize secondlargest to 0; and largest to 0; collect five numbers from users using a loop to iterate five time, sort the arrays of number to be arranged from largets to smallest
//



import java.util.Scanner;
import java.util.Arrays;
public class program{
public static void main(String[] args){
Scanner input = new Scanner(System.in);



    double [] numbers = new double [5];

    for(int count = 0; count < numbers.length; count ++){
    System.out.println("Enter a number: ");
    numbers [count] = input.nextInt();

    }

    double secondLargest = 0;
    double largest = 0;

    for(int index = 0; index < numbers.length; index ++){
     if(numbers[index] > largest){
        secondLargest = largest;
        largest = numbers[index];
}

    else if(numbers[index] > secondLargest){
        secondLargest = numbers[index];


}

}
    System.out.println("Second largest number is: " + secondLargest);



    }


}

//    public class program{
//    Scanner input = new Scanner(System.in);
//
//
//    
//    public static int secondLargest(){
//
//    secondLargest = 0;
//
//    for(int index = 0; index <= number.length; index ++){
//     if(numbers[index] > numbers){
//        numbers[index] = Largest;
//}
//
//
//    }
//
//    public static void main(String[] args){
//
//    for(int count = 0; count <= 5; count ++){
//    System.out.println("Enter a number: ");
//    int [] numbers = input.nextInt();
//}
//    Arrays.sort(numbers);
//
//    System.out.println("Second largest number is: " + secondLargest);
//    secondLargest();
//
//    }
    


//
//
//
//}
//
//}
//
//
//
//

